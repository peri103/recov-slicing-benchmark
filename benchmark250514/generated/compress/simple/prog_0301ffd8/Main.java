import org.apache.commons.compress.archivers.jar.JarArchiveEntry;

public class Main {
    public static void main(String[] args) {
        JarArchiveEntry jarEntry = new JarArchiveEntry("example.jar");
        /* write */ jarEntry.setCompressedSize(1024);
        /* read */ long compressedSize = jarEntry.getCompressedSize();
        System.out.println(compressedSize);
    }
}