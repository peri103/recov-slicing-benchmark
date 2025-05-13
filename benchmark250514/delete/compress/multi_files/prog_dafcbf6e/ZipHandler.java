import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;

public class ZipHandler {
    private ZipArchiveEntry zipEntry;

    public ZipHandler(String fileName) {
        zipEntry = new ZipArchiveEntry(fileName);
    }

    public void setCrcValue(long crc) {
        /* write */ zipEntry.setCrc(crc);
    }

    public long getCrcValue() {
        return zipEntry.getCrc();
    }
}
