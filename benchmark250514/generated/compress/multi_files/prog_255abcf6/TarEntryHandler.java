import org.apache.commons.compress.archivers.tar.TarArchiveEntry;

public class TarEntryHandler {
    private TarArchiveEntry entry;

    public TarEntryHandler(String fileName) {
        this.entry = new TarArchiveEntry(fileName);
    }

    public void setEntryMode(int mode) {
        /* write */ entry.setMode(mode);
    }

    public int getEntryMode() {
        return entry.getMode();
    }
}