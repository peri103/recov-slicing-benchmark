import org.apache.commons.compress.archivers.jar.JarArchiveEntry;

public class JarEntryManager {
    private JarArchiveEntry jarEntry;

    public JarEntryManager(String name) {
        this.jarEntry = new JarArchiveEntry(name);
    }

    public void setExtraData(byte[] extraData) {
        /* write */ jarEntry.setExtra(extraData);
    }

    public byte[] getExtraData() {
        return jarEntry.getExtra();
    }
}
