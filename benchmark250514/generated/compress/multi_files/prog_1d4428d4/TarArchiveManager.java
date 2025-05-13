import org.apache.commons.compress.archivers.tar.TarArchiveEntry;

public class TarArchiveManager {
    private TarArchiveEntry entry;

    public TarArchiveManager(String initialName) {
        entry = new TarArchiveEntry(initialName);
    }

    public void setEntryName(String newName) {
        /* write */ entry.setName(newName);
    }

    public String getEntryName() {
        return entry.getName();
    }
}
