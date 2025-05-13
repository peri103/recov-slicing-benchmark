import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;

public class ZipEntryManager {
    private ZipArchiveEntry zipEntry;

    public ZipEntryManager(String fileName) {
        zipEntry = new ZipArchiveEntry(fileName);
    }

    public void setCompressedSize(long size) {
        /* write */ zipEntry.setCompressedSize(size);
    }

    public long getCompressedSize() {
        return zipEntry.getCompressedSize();
    }
}
