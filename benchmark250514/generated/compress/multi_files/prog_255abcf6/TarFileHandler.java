import org.apache.commons.compress.archivers.tar.TarArchiveEntry;

public class TarFileHandler {
    private TarArchiveEntry entry;

    public TarFileHandler(String fileName) {
        entry = new TarArchiveEntry(fileName);
    }

    public void setFileMode(int mode) {
        /* write */ entry.setMode(mode);
    }

    public int getFileMode() {
        return entry.getMode();
    }
}