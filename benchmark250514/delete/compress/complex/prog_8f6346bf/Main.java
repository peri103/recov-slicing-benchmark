import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipFile;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ZipArchiveEntry zipEntry = new ZipArchiveEntry("example.txt");
        
        /* write */ zipEntry.setExternalAttributes(12345);
        
        // Initialize a map to store zip entries with their names
        Map<String, ZipArchiveEntry> zipEntriesMap = new HashMap<>();
        
        // Add zipEntry to the map
        zipEntriesMap.put(zipEntry.getName(), zipEntry);
        
        // Simulate some operations on the map
        for (String name : zipEntriesMap.keySet()) {
            ZipArchiveEntry entry = zipEntriesMap.get(name);
            System.out.println("Processing entry: " + entry.getName());
        }
        
        // Create another ZipArchiveEntry
        ZipArchiveEntry anotherEntry = new ZipArchiveEntry("another_example.txt");
        anotherEntry.setExternalAttributes(54321);
        
        // Add anotherEntry to the map
        zipEntriesMap.put(anotherEntry.getName(), anotherEntry);
        
        // More operations on the map
        for (ZipArchiveEntry entry : zipEntriesMap.values()) {
            System.out.println("Entry name: " + entry.getName() + ", External Attributes: " + entry.getExternalAttributes());
        }
        
        /* read */ int externalAttributes = zipEntry.getExternalAttributes();
        
        System.out.println("External Attributes of example.txt: " + externalAttributes);
        
        // Simulate calculation based on external attributes
        int sumOfAttributes = 0;
        for (ZipArchiveEntry entry : zipEntriesMap.values()) {
            sumOfAttributes += entry.getExternalAttributes();
        }
        
        System.out.println("Sum of External Attributes: " + sumOfAttributes);
    }
}