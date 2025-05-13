import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize a ZipArchiveEntry
        ZipArchiveEntry zipEntry = new ZipArchiveEntry("example.txt");
        
        // Create a map to simulate some complex logic
        Map<String, Integer> filePermissions = new HashMap<>();
        filePermissions.put("example.txt", 777);
        filePermissions.put("test.txt", 644);
        
        // Perform some operations on the map
        for (Map.Entry<String, Integer> entry : filePermissions.entrySet()) {
            System.out.println("File: " + entry.getKey() + ", Permissions: " + entry.getValue());
        }
        
        // Set external attributes using the write method
        /* write */ zipEntry.setExternalAttributes(12345L);
        
        // Perform some unrelated calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);
        
        // Simulate some logic that uses the map
        if (filePermissions.containsKey("example.txt")) {
            int permissions = filePermissions.get("example.txt");
            System.out.println("Permissions for example.txt: " + permissions);
        }
        
        // Read the external attributes using the read method
        /* read */ long attributes = zipEntry.getExternalAttributes();
        System.out.println("External Attributes: " + attributes);
        
        // More complex logic with a different map
        Map<String, String> fileTypes = new HashMap<>();
        fileTypes.put("example.txt", "text");
        fileTypes.put("image.png", "image");
        
        // Iterate and print file types
        for (Map.Entry<String, String> entry : fileTypes.entrySet()) {
            System.out.println("File: " + entry.getKey() + ", Type: " + entry.getValue());
        }
    }
}