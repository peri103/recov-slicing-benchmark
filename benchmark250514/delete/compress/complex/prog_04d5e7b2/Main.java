import org.apache.commons.compress.archivers.ar.ArArchiveEntry;
import org.apache.commons.compress.archivers.ar.ArArchiveOutputStream;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ArArchiveEntry entry = new ArArchiveEntry("example.txt", 0);
        /* write */ entry.setSize(1024);
        
        // Create a collection to store multiple entries
        ArrayList<ArArchiveEntry> archiveEntries = new ArrayList<>();
        archiveEntries.add(entry);
        
        // Create a map to simulate some metadata storage
        HashMap<String, Long> entrySizes = new HashMap<>();
        for (ArArchiveEntry e : archiveEntries) {
            entrySizes.put(e.getName(), e.getSize());
        }

        // Add more entries to demonstrate complexity
        ArArchiveEntry entry2 = new ArArchiveEntry("example2.txt", 2048);
        archiveEntries.add(entry2);
        entrySizes.put(entry2.getName(), entry2.getSize());

        // Simulate some processing on the entries
        for (ArArchiveEntry e : archiveEntries) {
            System.out.println("Processing entry: " + e.getName());
        }

        // Retrieve the size of the first entry
        /* read */ long size = entry.getSize();
        System.out.println("Size of 'example.txt': " + size);

        // Further processing on entry sizes
        long totalSize = 0;
        for (Long entrySize : entrySizes.values()) {
            totalSize += entrySize;
        }
        System.out.println("Total size of all entries: " + totalSize);
    }
}