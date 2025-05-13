import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ZipArchiveEntry entry = new ZipArchiveEntry("example.txt");
        
        /* write */ entry.setCrc(123456789L);
        
        // Additional code to make the program more complex
        Map<String, Integer> fileSizes = new HashMap<>();
        fileSizes.put("example.txt", 1024);
        fileSizes.put("data.bin", 2048);
        fileSizes.put("image.png", 4096);
        
        int totalSize = 0;
        for (Map.Entry<String, Integer> fileEntry : fileSizes.entrySet()) {
            totalSize += fileEntry.getValue();
            System.out.println("File: " + fileEntry.getKey() + ", Size: " + fileEntry.getValue());
        }
        
        // Simulate some operations with ZipArchiveEntry
        ZipArchiveEntry additionalEntry = new ZipArchiveEntry("additional.txt");
        additionalEntry.setCrc(987654321L);
        long additionalCrcValue = additionalEntry.getCrc();
        System.out.println("Additional CRC: " + additionalCrcValue);
        
        // More unrelated operations
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);
        
        // Reading the CRC value from the original entry
        /* read */ long crcValue = entry.getCrc();
        
        System.out.println("Original CRC: " + crcValue);
        System.out.println("Total file size: " + totalSize);
    }
}