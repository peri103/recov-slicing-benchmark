import org.apache.commons.compress.archivers.ar.ArArchiveEntry;

public class ArchiveEntryWrapper {
    private ArArchiveEntry entry;

    public ArchiveEntryWrapper(String name, long size) {
        entry = new ArArchiveEntry(name, size);
    }

    public void setUserId(long userId) {
        /* write */ entry.setUserId(userId);
    }

    public long getUserId() {
        return entry.getUserId();
    }
}