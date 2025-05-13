import org.apache.commons.compress.archivers.tar.TarArchiveEntry;

public class GroupManager {
    private TarArchiveEntry entry;

    public GroupManager(String fileName) {
        entry = new TarArchiveEntry(fileName);
    }

    public void setGroupName(String groupName) {
        /* write */ entry.setGroupName(groupName);
    }

    public String getGroupName() {
        return entry.getGroupName();
    }
}
