import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize a ZipArchiveEntry
        ZipArchiveEntry zipEntry = new ZipArchiveEntry("example.txt");
        
        // Initialize a HashMap to store file metadata
        Map<String, Object> fileMetadata = new HashMap<>();
        
        // Add some metadata to the map
        fileMetadata.put("filename", zipEntry.getName());
        fileMetadata.put("size", zipEntry.getSize());
        fileMetadata.put("compressedSize", zipEntry.getCompressedSize());
        
        // Add CRC value to the metadata
        /* write */ zipEntry.setCrc(123456789L);
        
        // Manipulate the metadata map
        fileMetadata.put("lastModifiedTime", System.currentTimeMillis());
        fileMetadata.put("comment", "This is a zip entry for testing.");
        
        // Perform some calculations with metadata
        long size = zipEntry.getSize();
        long compressedSize = zipEntry.getCompressedSize();
        double compressionRatio = (size > 0) ? ((double) compressedSize / size) : 0.0;
        System.out.println("Compression Ratio: " + compressionRatio);
        
        // Retrieve the CRC value from the ZipArchiveEntry
        /* read */ long crcValue = zipEntry.getCrc();
        System.out.println("CRC Value: " + crcValue);
        
        // Print all metadata
        System.out.println("File Metadata:");
        for (Map.Entry<String, Object> entry : fileMetadata.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}