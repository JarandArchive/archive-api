package dev.jarand.archiveapi.item.rest.resource;

import dev.jarand.archiveapi.item.domain.ImportResult;
import org.springframework.stereotype.Component;

@Component
public class ImportResultResourceAssembler {

    public ImportResultResource assemble(ImportResult importResult) {
        return new ImportResultResource(importResult.getAdded(), importResult.getUpdated(), importResult.getDeleted());
    }
}
