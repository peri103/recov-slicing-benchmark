import org.apache.commons.compress.archivers.jar.JarArchiveEntry;

public class JarEntryManager {
    private JarArchiveEntry entry;

    public JarEntryManager(String name) {
        entry = new JarArchiveEntry(name);
    }

    public void setExtraData(byte[] extraData) {
        /* write */ entry.setExtra(extraData);
    }

    public byte[] getExtraData() {
        return entry.getExtra();
    }
}