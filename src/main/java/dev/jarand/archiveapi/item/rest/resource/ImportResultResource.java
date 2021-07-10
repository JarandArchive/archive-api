package dev.jarand.archiveapi.item.rest.resource;

public class ImportResultResource {

    private final int added;
    private final int updated;
    private final int deleted;

    public ImportResultResource(int added, int updated, int deleted) {
        this.added = added;
        this.updated = updated;
        this.deleted = deleted;
    }

    public int getAdded() {
        return added;
    }

    public int getUpdated() {
        return updated;
    }

    public int getDeleted() {
        return deleted;
    }
}
