import org.apache.commons.compress.archivers.jar.JarArchiveEntry;

public class Main {
    public static void main(String[] args) {
        JarArchiveEntry jarEntry = new JarArchiveEntry("example.jar");
        /* write */ jarEntry.setSize(1024);
        /* read */ long size = jarEntry.getSize();
        System.out.println("Jar entry size: " + size);
    }
}