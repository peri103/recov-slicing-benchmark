import org.apache.commons.compress.archivers.ar.ArArchiveEntry;

public class ArchiveEntry {
    private ArArchiveEntry entry;

    public ArchiveEntry(String name, long size) {
        this.entry = new ArArchiveEntry(name, size);
    }

    public void setUserId(int userId) {
        /* write */ entry.setUserId(userId);
    }

    public int getUserId() {
        return entry.getUserId();
    }

    public String getName() {
        return entry.getName();
    }

    public long getSize() {
        return entry.getSize();
    }
}
