import org.apache.commons.compress.archivers.ar.ArArchiveEntry;

public class ArchiveManager {
    private ArArchiveEntry entry;

    public ArchiveManager(String fileName, long fileSize) {
        this.entry = new ArArchiveEntry(fileName, fileSize);
    }

    public void setGroupName(String groupName) {
        /* write */ entry.setGroupName(groupName);
    }

    public String getGroupName() {
        /* read */ return entry.getGroupName();
    }
}
