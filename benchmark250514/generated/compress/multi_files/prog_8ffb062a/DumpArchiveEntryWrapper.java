import org.apache.commons.compress.archivers.dump.DumpArchiveEntry;

public class DumpArchiveEntryWrapper {
    private DumpArchiveEntry entry;

    public DumpArchiveEntryWrapper() {
        entry = new DumpArchiveEntry();
    }

    public void setUserId(int userId) {
        /* write */ entry.setUserId(userId);
    }

    public int getUserId() {
        return entry.getUserId();
    }
}