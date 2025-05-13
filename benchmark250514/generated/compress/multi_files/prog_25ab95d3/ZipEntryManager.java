import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;

public class ZipEntryManager {
    private ZipArchiveEntry entry;

    public ZipEntryManager(String fileName) {
        this.entry = new ZipArchiveEntry(fileName);
    }

    public void setEntryUnixMode(int mode) {
        /* write */ entry.setUnixMode(mode);
    }

    public int getEntryUnixMode() {
        return entry.getUnixMode();
    }
}