import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;

public class ZipEntryHandler {
    private ZipArchiveEntry zipEntry;

    public ZipEntryHandler(String fileName) {
        zipEntry = new ZipArchiveEntry(fileName);
    }

    public void setEntrySize(long size) {
        /* write */ zipEntry.setSize(size);
    }

    public long getEntrySize() {
        return zipEntry.getSize();
    }
}
