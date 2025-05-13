import org.apache.commons.compress.archivers.tar.TarArchiveEntry;

public class TarEntryManager {
    private TarArchiveEntry entry;

    public TarEntryManager(String fileName) {
        this.entry = new TarArchiveEntry(fileName);
    }

    public void setEntrySize(long size) {
        /* write */ entry.setSize(size);
    }

    public long getEntrySize() {
        return entry.getSize();
    }
}
