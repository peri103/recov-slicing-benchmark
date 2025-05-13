import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;

public class Main {
    public static void main(String[] args) {
        ZipArchiveEntry zipEntry = new ZipArchiveEntry("example.txt");
        
        /* write */ zipEntry.setCrc(123456789L);
        
        /* read */ long crcValue = zipEntry.getCrc();
        
        System.out.println(crcValue);
    }
}