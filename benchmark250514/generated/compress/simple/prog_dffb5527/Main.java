import org.apache.commons.compress.archivers.jar.JarArchiveEntry;

public class Main {
    public static void main(String[] args) {
        JarArchiveEntry jarEntry = new JarArchiveEntry("example.jar");
        /* write */ jarEntry.setCrc(123456789L);
        /* read */ long crcValue = jarEntry.getCrc();
        System.out.println(crcValue);
    }
}