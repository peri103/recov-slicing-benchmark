import org.apache.commons.compress.archivers.jar.JarArchiveEntry;

public class Main {
    public static void main(String[] args) {
        JarArchiveEntry entry = new JarArchiveEntry("example.jar");
        /* write */ entry.setSize(1024);
        /* read */ long size = entry.getSize();
        System.out.println(size);
    }
}