import org.apache.commons.compress.archivers.jar.JarArchiveEntry;

public class JarArchiveDetails {
    private JarArchiveEntry jarEntry;

    public JarArchiveDetails(String fileName) {
        this.jarEntry = new JarArchiveEntry(fileName);
    }

    public void setCompressedSize(long size) {
        /* write */ jarEntry.setCompressedSize(size);
    }

    public long getCompressedSize() {
        return jarEntry.getCompressedSize();
    }
}