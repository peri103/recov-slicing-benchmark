import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;

public class ZipArchiveHandler {
    private ZipArchiveEntry zipEntry;

    public ZipArchiveHandler(String fileName) {
        this.zipEntry = new ZipArchiveEntry(fileName);
    }

    public void setCompressionMethod(int method) {
        /* write */ zipEntry.setMethod(method);
    }

    public int getCompressionMethod() {
        return zipEntry.getMethod();
    }
}
