import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize ZipArchiveEntry
        ZipArchiveEntry entry = new ZipArchiveEntry("example.txt");
        
        // Initialize a HashMap to store file names and their sizes
        HashMap<String, Long> fileSizeMap = new HashMap<>();
        
        // Initialize an ArrayList to store multiple ZipArchiveEntries
        ArrayList<ZipArchiveEntry> entryList = new ArrayList<>();
        
        // Add a few entries to the list
        entryList.add(new ZipArchiveEntry("file1.txt"));
        entryList.add(new ZipArchiveEntry("file2.txt"));
        
        // Set sizes for the entries in the list
        entryList.get(0).setSize(500);
        entryList.get(1).setSize(1500);
        
        // Store the sizes in the HashMap
        for (ZipArchiveEntry e : entryList) {
            fileSizeMap.put(e.getName(), e.getSize());
        }
        
        // Perform operations on the HashMap
        for (String fileName : fileSizeMap.keySet()) {
            System.out.println("File: " + fileName + ", Size: " + fileSizeMap.get(fileName));
        }
        
        // Write the size for the main entry
        /* write */ entry.setSize(1024);
        
        // More complex operations
        long totalSize = 0;
        for (ZipArchiveEntry e : entryList) {
            totalSize += e.getSize();
        }
        
        // Add the main entry to the list
        entryList.add(entry);
        
        // Read the size of the main entry
        /* read */ long size = entry.getSize();
        System.out.println("Main entry size: " + size);
        
        // Calculate the total size including the main entry
        totalSize += entry.getSize();
        System.out.println("Total size of all entries: " + totalSize);
        
        // Perform additional operations on the list
        for (ZipArchiveEntry e : entryList) {
            System.out.println("Entry: " + e.getName() + ", Size: " + e.getSize());
        }
    }
}