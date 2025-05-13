import org.apache.commons.compress.archivers.ar.ArArchiveEntry;

public class ArchiveManager {
    private ArArchiveEntry entry;

    public ArchiveManager(String name, long initialSize) {
        this.entry = new ArArchiveEntry(name, initialSize);
    }

    public void updateSize(long newSize) {
        /* write */ entry.setSize(newSize);
    }

    public long getSize() {
        return entry.getSize();
    }
}
