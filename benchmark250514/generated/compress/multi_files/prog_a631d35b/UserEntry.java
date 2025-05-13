import org.apache.commons.compress.archivers.dump.DumpArchiveEntry;

public class UserEntry {
    private DumpArchiveEntry entry;

    public UserEntry() {
        entry = new DumpArchiveEntry();
    }

    public void setUserId(int userId) {
        /* write */ entry.setUserId(userId);
    }

    public int getUserId() {
        return entry.getUserId();
    }
}
