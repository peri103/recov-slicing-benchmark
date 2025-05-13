import org.apache.commons.compress.archivers.tar.TarArchiveEntry;

public class TarHandler {
    private TarArchiveEntry tarEntry;

    public TarHandler(String fileName) {
        this.tarEntry = new TarArchiveEntry(fileName);
    }

    public void setEntrySize(long size) {
        /* write */ tarEntry.setSize(size);
    }

    public long getEntrySize() {
        return tarEntry.getSize();
    }
}