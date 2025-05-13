import org.apache.commons.compress.archivers.jar.JarArchiveEntry;

public class JarEntryHandler {
    private JarArchiveEntry jarEntry;

    public JarEntryHandler(String jarName) {
        jarEntry = new JarArchiveEntry(jarName);
    }

    public void setComment(String comment) {
        /* write */ jarEntry.setComment(comment);
    }

    public String getComment() {
        return jarEntry.getComment();
    }
}