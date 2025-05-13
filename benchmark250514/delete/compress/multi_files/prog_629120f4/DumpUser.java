import org.apache.commons.compress.archivers.dump.DumpArchiveEntry;

public class DumpUser {
    private DumpArchiveEntry entry;

    public DumpUser() {
        this.entry = new DumpArchiveEntry();
    }

    public void setUserId(long userId) {
        /* write */ entry.setUserId(userId);
    }

    public long getUserId() {
        return entry.getUserId();
    }
}
