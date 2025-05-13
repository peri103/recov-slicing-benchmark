import org.apache.commons.compress.archivers.dump.DumpArchiveEntry;

public class GroupEntry {
    private DumpArchiveEntry entry;

    public GroupEntry() {
        this.entry = new DumpArchiveEntry();
    }

    public void setGroupId(long groupId) {
        /* write */ entry.setGroupId(groupId);
    }

    public long getGroupId() {
        return entry.getGroupId();
    }
}
