import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;

public class ZipAttributes {
    private ZipArchiveEntry zipEntry;

    public ZipAttributes(String fileName) {
        this.zipEntry = new ZipArchiveEntry(fileName);
    }

    public void setAttributes(long attributes) {
        /* write */ zipEntry.setExternalAttributes(attributes);
    }

    public long getAttributes() {
        return zipEntry.getExternalAttributes();
    }
}
