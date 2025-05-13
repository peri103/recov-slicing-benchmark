import org.apache.commons.compress.archivers.jar.JarArchiveEntry;

public class Main {
    public static void main(String[] args) {
        JarArchiveEntry entry = new JarArchiveEntry("example.jar");
        /* write */ entry.setUnixMode(0755);
        /* read */ int mode = entry.getUnixMode();
        System.out.println(mode);
    }
}