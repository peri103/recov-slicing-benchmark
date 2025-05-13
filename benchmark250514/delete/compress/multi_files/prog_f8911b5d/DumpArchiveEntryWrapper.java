import org.apache.commons.compress.archivers.dump.DumpArchiveEntry;

public class DumpArchiveEntryWrapper {
    private DumpArchiveEntry entry;

    public DumpArchiveEntryWrapper() {
        this.entry = new DumpArchiveEntry();
    }

    public void setGroupName(String groupName) {
        /* write */ entry.setGroupName(groupName);
    }

    public String getGroupName() {
        return entry.getGroupName();
    }
}
