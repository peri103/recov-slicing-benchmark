import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;

public class CompressedFile {
    private ZipArchiveEntry zipEntry;

    public CompressedFile(String fileName) {
        this.zipEntry = new ZipArchiveEntry(fileName);
    }

    public void setCompressedSize(long size) {
        /* write */ zipEntry.setCompressedSize(size);
    }

    public long getCompressedSize() {
        return zipEntry.getCompressedSize();
    }
}