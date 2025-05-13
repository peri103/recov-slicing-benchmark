import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ZipArchiveEntry zipEntry = new ZipArchiveEntry("example.txt");
        Map<String, Integer> compressionMethods = new HashMap<>();
        compressionMethods.put("STORED", ZipArchiveEntry.STORED);
        compressionMethods.put("DEFLATED", ZipArchiveEntry.DEFLATED);
        
        // Set method for the zip entry
        /* write */ zipEntry.setMethod(compressionMethods.get("DEFLATED"));

        // Simulate some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // More unrelated logic
        for (Map.Entry<String, Integer> entry : compressionMethods.entrySet()) {
            System.out.println("Method: " + entry.getKey() + ", Code: " + entry.getValue());
        }

        // Now read the method set earlier
        /* read */ int method = zipEntry.getMethod();
        System.out.println("Compression method: " + method);

        // Additional complexity with another ZipArchiveEntry
        ZipArchiveEntry zipEntry2 = new ZipArchiveEntry("another_example.txt");
        zipEntry2.setMethod(ZipArchiveEntry.STORED);
        int method2 = zipEntry2.getMethod();
        System.out.println("Compression method for another_example.txt: " + method2);
    }
}