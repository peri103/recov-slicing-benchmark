import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;

public class Main {
    public static void main(String[] args) {
        // Initialize the ZipArchiveEntry object
        ZipArchiveEntry zipEntry = new ZipArchiveEntry("example.txt");
        
        // Use the write method to set the CRC value
        /* write */ zipEntry.setCrc(123456789L);
        
        // Use the read method to get the CRC value
        /* read */ long crcValue = zipEntry.getCrc();
        
        // Print the CRC value to verify it was set and read correctly
        System.out.println(crcValue);
    }
}