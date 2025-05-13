import org.apache.commons.compress.archivers.dump.DumpArchiveEntry;

public class UnixPermissionManager {
    private DumpArchiveEntry entry;

    public UnixPermissionManager() {
        entry = new DumpArchiveEntry();
    }

    public void setPermission(int mode) {
        /* write */ entry.setUnixMode(mode);
    }

    public int getPermission() {
        return entry.getUnixMode();
    }
}
