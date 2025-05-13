import org.apache.commons.compress.archivers.jar.JarArchiveEntry;

public class JarEntryManager {
    private JarArchiveEntry entry;

    public JarEntryManager(String name) {
        this.entry = new JarArchiveEntry(name);
    }

    public void setCrcValue(long crc) {
        /* write */ entry.setCrc(crc);
    }

    public long getCrcValue() {
        return entry.getCrc();
    }
}