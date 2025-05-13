import org.apache.commons.compress.archivers.jar.JarArchiveEntry;

public class JarEntryManager {
    private JarArchiveEntry jarEntry;

    public JarEntryManager(String fileName) {
        jarEntry = new JarArchiveEntry(fileName);
    }

    public void setEntryTime(long time) {
        /* write */ jarEntry.setTime(time);
    }

    public long getEntryTime() {
        return jarEntry.getTime();
    }
}
