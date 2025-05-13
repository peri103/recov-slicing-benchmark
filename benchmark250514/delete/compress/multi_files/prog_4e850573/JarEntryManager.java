import org.apache.commons.compress.archivers.jar.JarArchiveEntry;

public class JarEntryManager {
    private JarArchiveEntry jarEntry;

    public JarEntryManager(String initialName) {
        this.jarEntry = new JarArchiveEntry(initialName);
    }

    public void updateName(String newName) {
        /* write */ jarEntry.setName(newName);
    }

    public String retrieveName() {
        return jarEntry.getName();
    }
}
