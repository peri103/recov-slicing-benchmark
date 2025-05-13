import org.apache.commons.compress.archivers.ar.ArArchiveEntry;

public class ArchiveEntryManager {
    private ArArchiveEntry entry;

    public ArchiveEntryManager(String name, long size) {
        this.entry = new ArArchiveEntry(name, size);
    }

    public void setAttributes(long attributes) {
        /* write */ entry.setExternalAttributes(attributes);
    }

    public ArArchiveEntry getEntry() {
        return entry;
    }
}
