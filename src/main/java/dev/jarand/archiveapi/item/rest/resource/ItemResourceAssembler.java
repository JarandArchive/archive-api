package dev.jarand.archiveapi.item.rest.resource;

import dev.jarand.archiveapi.item.domain.Item;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ItemResourceAssembler {

    public List<ItemResource> assemble(List<Item> items) {
        return items.stream().map(this::assemble).toList();
    }

    public ItemResource assemble(Item item) {
        return new ItemResource(
                item.getId(),
                item.getDate().orElse(null),
                item.getShop().orElse(null),
                item.getBaker1().orElse(null),
                item.getEstablished().orElse(null),
                item.getBaker2().orElse(null),
                item.getPlace().orElse(null),
                item.getSeries().orElse(null),
                item.getBreadName().orElse(null),
                item.getDescription().orElse(null),
                item.getComposition().orElse(null),
                item.getHealthClaim().orElse(null),
                item.getName().orElse(null),
                item.getSupport().orElse(null),
                item.getMotive().orElse(null),
                item.getBagColor().orElse(null),
                item.getCoarseness().orElse(null),
                item.getCoarsenessPercentage().orElse(null),
                item.getFibrePercentage().orElse(null),
                item.getWeight().orElse(null),
                item.getPrice().orElse(null),
                item.getKeyhole().orElse(null),
                item.getComment().orElse(null),
                item.getPricePerKg().orElse(null),
                item.getImageFront().orElse(null),
                item.getImageBack().orElse(null));
    }
}
