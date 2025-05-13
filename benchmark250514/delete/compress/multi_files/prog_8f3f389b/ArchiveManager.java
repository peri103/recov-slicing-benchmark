import org.apache.commons.compress.archivers.dump.DumpArchiveEntry;

public class ArchiveManager {
    private DumpArchiveEntry entry = new DumpArchiveEntry();

    public void setGroupId(long groupId) {
        /* write */ entry.setGroupId(groupId);
    }

    public long getGroupId() {
        return entry.getGroupId();
    }

    public void setEntryDetails(String name, int userId, long fileSize) {
        entry.setName(name);
        entry.setUserId(userId);
        entry.setFileSize(fileSize);
    }

    public String getEntryName() {
        return entry.getName();
    }

    public int getUserId() {
        return entry.getUserId();
    }

    public long getFileSize() {
        return entry.getFileSize();
    }
}
