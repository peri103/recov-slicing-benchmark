import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;

public class Main {
    public static void main(String[] args) {
        ZipArchiveEntry entry = new ZipArchiveEntry("example.txt");
        /* write */ entry.setCrc(123456789L);
        /* read */ long crcValue = entry.getCrc();
        System.out.println(crcValue);
    }
}