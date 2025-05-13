import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;

public class ZipExtraDataHandler {
    private ZipArchiveEntry entry;

    public ZipExtraDataHandler(String entryName) {
        this.entry = new ZipArchiveEntry(entryName);
    }

    public void setExtraData(byte[] data) {
        /* write */ entry.setExtra(data);
    }

    public byte[] getExtraData() {
        return entry.getExtra();
    }
}
