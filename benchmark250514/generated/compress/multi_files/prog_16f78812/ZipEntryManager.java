import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;

public class ZipEntryManager {
    private ZipArchiveEntry entry;

    public ZipEntryManager(String fileName) {
        this.entry = new ZipArchiveEntry(fileName);
    }

    public void setAttributes(long attributes) {
        /* write */ entry.setExternalAttributes(attributes);
    }

    public long getAttributes() {
        return entry.getExternalAttributes();
    }
}