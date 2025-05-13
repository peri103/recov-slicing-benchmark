import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;

public class ZipEntryManager {
    private ZipArchiveEntry entry;

    public ZipEntryManager(String fileName) {
        this.entry = new ZipArchiveEntry(fileName);
    }

    public void setExtraData(byte[] data) {
        /* write */ entry.setExtra(data);
    }

    public byte[] getExtraData() {
        return entry.getExtra();
    }
}
