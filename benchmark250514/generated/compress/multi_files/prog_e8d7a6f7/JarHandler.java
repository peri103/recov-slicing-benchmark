import org.apache.commons.compress.archivers.jar.JarArchiveEntry;

public class JarHandler {
    private JarArchiveEntry jarEntry;

    public JarHandler(String entryName) {
        jarEntry = new JarArchiveEntry(entryName);
    }

    public void setExtraData(byte[] extraData) {
        /* write */ jarEntry.setExtra(extraData);
    }

    public byte[] getExtraData() {
        return jarEntry.getExtra();
    }
}