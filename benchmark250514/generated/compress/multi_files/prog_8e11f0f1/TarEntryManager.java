import org.apache.commons.compress.archivers.tar.TarArchiveEntry;

public class TarEntryManager {
    private TarArchiveEntry entry;

    public TarEntryManager(String fileName) {
        entry = new TarArchiveEntry(fileName);
    }

    public void setUserName(String userName) {
        /* write */ entry.setUserName(userName);
    }

    public String getUserName() {
        return entry.getUserName();
    }

    public TarArchiveEntry getEntry() {
        return entry;
    }
}
