import org.apache.commons.compress.archivers.tar.TarArchiveEntry;

public class TarEntryHandler {
    private TarArchiveEntry entry;

    public TarEntryHandler(String initialName) {
        this.entry = new TarArchiveEntry(initialName);
    }

    public void setEntryName(String newName) {
        /* write */ entry.setName(newName);
    }

    public String getEntryName() {
        return entry.getName();
    }
}