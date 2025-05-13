import org.apache.commons.compress.archivers.dump.DumpArchiveEntry;

public class ArchiveEntryHandler {
    private DumpArchiveEntry entry = new DumpArchiveEntry();

    public void setUserName(String userName) {
        /* write */ entry.setUserName(userName);
    }

    public String getUserName() {
        return entry.getUserName();
    }

    public void setEntrySize(long size) {
        entry.setSize(size);
    }

    public long getEntrySize() {
        return entry.getSize();
    }
}
