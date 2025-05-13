import org.apache.commons.compress.archivers.jar.JarArchiveEntry;

public class Main {
    public static void main(String[] args) {
        JarArchiveEntry jarEntry = new JarArchiveEntry("example.jar");
        /* write */ jarEntry.setUnixMode(0755);
        /* read */ int unixMode = jarEntry.getUnixMode();
        System.out.println(unixMode);
    }
}