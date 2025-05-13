import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;

public class ZipEntryManager {
    private ZipArchiveEntry entry;

    public ZipEntryManager(String fileName) {
        entry = new ZipArchiveEntry(fileName);
    }

    public void setCompressionMethod(int method) {
        /* write */ entry.setMethod(method);
    }

    public int getCompressionMethod() {
        return entry.getMethod();
    }
}