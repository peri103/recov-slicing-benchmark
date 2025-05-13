import org.apache.commons.compress.archivers.jar.JarArchiveEntry;

public class JarCommentManager {
    private JarArchiveEntry entry;

    public JarCommentManager(String jarName) {
        this.entry = new JarArchiveEntry(jarName);
    }

    public void setComment(String comment) {
        /* write */ entry.setComment(comment);
    }

    public String getComment() {
        return entry.getComment();
    }
}
