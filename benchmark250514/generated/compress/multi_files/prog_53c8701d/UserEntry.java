import org.apache.commons.compress.archivers.tar.TarArchiveEntry;

public class UserEntry {
    private TarArchiveEntry entry;

    public UserEntry(String fileName) {
        this.entry = new TarArchiveEntry(fileName);
    }

    public void setUserName(String userName) {
        /* write */ entry.setUserName(userName);
    }

    public String getUserName() {
        return entry.getUserName();
    }
}
