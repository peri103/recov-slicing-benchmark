import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;

public class ZipEntryManager {
    private ZipArchiveEntry zipEntry;

    public ZipEntryManager(String fileName) {
        zipEntry = new ZipArchiveEntry(fileName);
    }

    public void setCompressionMethod(int method) {
        /* write */ zipEntry.setMethod(method);
    }

    public int getCompressionMethod() {
        return zipEntry.getMethod();
    }
}
