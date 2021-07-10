package dev.jarand.archiveapi.item.rest;

import dev.jarand.archiveapi.item.ItemService;
import dev.jarand.archiveapi.item.assembler.ItemAssembler;
import dev.jarand.archiveapi.item.domain.Item;
import dev.jarand.archiveapi.item.rest.resource.ImportResultResource;
import dev.jarand.archiveapi.item.rest.resource.ImportResultResourceAssembler;
import dev.jarand.archiveapi.item.rest.resource.ItemResource;
import dev.jarand.archiveapi.item.rest.resource.ItemResourceAssembler;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@RestController
@RequestMapping("item")
public class ItemController {

    private final ItemService service;
    private final ItemAssembler assembler;
    private final ItemResourceAssembler resourceAssembler;
    private final ImportResultResourceAssembler importResultResourceAssembler;

    public ItemController(ItemService service, ItemAssembler assembler, ItemResourceAssembler resourceAssembler, ImportResultResourceAssembler importResultResourceAssembler) {
        this.service = service;
        this.assembler = assembler;
        this.resourceAssembler = resourceAssembler;
        this.importResultResourceAssembler = importResultResourceAssembler;
    }

    @GetMapping
    public ResponseEntity<List<ItemResource>> getItems() {
        return ResponseEntity.ok(resourceAssembler.assemble(service.getItems()));
    }

    @GetMapping("{id}")
    public ResponseEntity<ItemResource> getItem(@PathVariable int id) {
        return service.getItem(id).map(resourceAssembler::assemble).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(value = "import", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<ImportResultResource> importFromFile(@RequestParam MultipartFile file) {
        final var existingItems = service.getItems().stream().collect(Collectors.toMap(Item::getId, Function.identity()));
        final var items = assembler.assemble(file, existingItems);
        final var importResult = service.importItems(items);
        return ResponseEntity.ok(importResultResourceAssembler.assemble(importResult));
    }
}
