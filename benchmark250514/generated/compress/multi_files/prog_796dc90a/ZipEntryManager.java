import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;

public class ZipEntryManager {
    private ZipArchiveEntry zipEntry;

    public ZipEntryManager(String fileName) {
        this.zipEntry = new ZipArchiveEntry(fileName);
    }

    public void setExtraData(byte[] extraData) {
        /* write */ zipEntry.setExtra(extraData);
    }

    public byte[] getExtraData() {
        return zipEntry.getExtra();
    }
}
