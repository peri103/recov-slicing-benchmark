import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;

public class CompressedData {
    private ZipArchiveEntry zipEntry;

    public CompressedData(String fileName) {
        this.zipEntry = new ZipArchiveEntry(fileName);
    }

    public void setCompressedSize(long size) {
        /* write */ zipEntry.setCompressedSize(size);
    }

    public long getCompressedSize() {
        return zipEntry.getCompressedSize();
    }
}
