import org.apache.commons.compress.archivers.tar.TarArchiveEntry;

public class TarEntryManager {
    private TarArchiveEntry entry;

    public TarEntryManager(String entryName) {
        entry = new TarArchiveEntry(entryName);
    }

    public void setGroupName(String groupName) {
        /* write */ entry.setGroupName(groupName);
    }

    public String getGroupName() {
        return entry.getGroupName();
    }
}
