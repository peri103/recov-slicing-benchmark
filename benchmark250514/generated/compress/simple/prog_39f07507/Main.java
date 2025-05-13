import org.apache.commons.compress.archivers.jar.JarArchiveEntry;

public class Main {
    public static void main(String[] args) {
        JarArchiveEntry entry = new JarArchiveEntry("example.jar");
        /* write */ entry.setCrc(123456789L);
        /* read */ long crcValue = entry.getCrc();
        System.out.println(crcValue);
    }
}