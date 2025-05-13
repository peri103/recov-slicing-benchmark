import org.apache.commons.compress.archivers.jar.JarArchiveEntry;

public class Main {
    public static void main(String[] args) {
        JarArchiveEntry entry = new JarArchiveEntry("example.jar");
        /* write */ entry.setCompressedSize(1024);
        /* read */ long compressedSize = entry.getCompressedSize();
        System.out.println(compressedSize);
    }
}