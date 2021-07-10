package dev.jarand.archiveapi.item;

import dev.jarand.archiveapi.item.domain.ImportResult;
import dev.jarand.archiveapi.item.domain.Item;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    public List<Item> getItems() {
        return List.of();
    }

    public Optional<Item> getItem(int id) {
        return Optional.ofNullable(null);
    }

    public ImportResult importItems(List<Item> items) {
        return new ImportResult(items.size(), 0, 0);
    }
}
