import org.apache.commons.compress.archivers.jar.JarArchiveEntry;

public class CrcManager {
    private JarArchiveEntry entry;

    public CrcManager(String fileName) {
        entry = new JarArchiveEntry(fileName);
    }

    public void setCrcValue(long crc) {
        /* write */ entry.setCrc(crc);
    }

    public long getCrcValue() {
        return entry.getCrc();
    }
}