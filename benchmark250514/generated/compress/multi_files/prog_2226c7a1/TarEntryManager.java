import org.apache.commons.compress.archivers.tar.TarArchiveEntry;

public class TarEntryManager {
    private TarArchiveEntry entry;

    public TarEntryManager(String fileName) {
        entry = new TarArchiveEntry(fileName);
    }

    public void setUserId(int userId) {
        /* write */ entry.setUserId(userId);
    }

    public int getUserId() {
        return entry.getUserId();
    }
}
