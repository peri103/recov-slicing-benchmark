import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;

public class ZipMetadata {
    private ZipArchiveEntry zipEntry;

    public ZipMetadata(String fileName) {
        this.zipEntry = new ZipArchiveEntry(fileName);
    }

    public void setCrc(long crc) {
        /* write */ zipEntry.setCrc(crc);
    }

    public long getCrc() {
        return zipEntry.getCrc();
    }

    public String getFileName() {
        return zipEntry.getName();
    }

    public long getSize() {
        return zipEntry.getSize();
    }

    public long getCompressedSize() {
        return zipEntry.getCompressedSize();
    }
}
