import org.apache.commons.compress.archivers.tar.TarArchiveEntry;

public class TarArchiveHandler {
    private TarArchiveEntry entry;

    public TarArchiveHandler(String entryName) {
        this.entry = new TarArchiveEntry(entryName);
    }

    public void setUserName(String userName) {
        /* write */ entry.setUserName(userName);
    }

    public String getUserName() {
        return entry.getUserName();
    }
}