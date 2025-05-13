import org.apache.commons.compress.archivers.ar.ArArchiveEntry;

public class ArchiveEntryHandler {
    private ArArchiveEntry entry;

    public ArchiveEntryHandler(String name, long size) {
        entry = new ArArchiveEntry(name, size);
    }

    public void handleEntry(ArchiveManager manager) {
        manager.addEntry(entry);
    }

    public long getEntryLastModified() {
        /* read */ return entry.getLastModified();
    }
}
