import org.apache.commons.compress.archivers.ar.ArArchiveEntry;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize the ArArchiveEntry
        ArArchiveEntry entry = new ArArchiveEntry("example.txt", 100L);
        
        // Initialize a HashMap to store file names and their modes
        HashMap<String, Integer> fileModes = new HashMap<>();
        
        // Initialize a list to keep track of entries
        ArrayList<ArArchiveEntry> entries = new ArrayList<>();
        
        // Add an entry to the list
        entries.add(new ArArchiveEntry("file1.txt", 200L));
        entries.add(entry);
        
        // Set Unix mode for the entry
        /* write */ entry.setUnixMode(644);
        
        // Add file names and their modes to the HashMap
        for (ArArchiveEntry ent : entries) {
            fileModes.put(ent.getName(), ent.getUnixMode());
        }
        
        // Print all file names and their modes
        for (String fileName : fileModes.keySet()) {
            System.out.println("File: " + fileName + ", Mode: " + fileModes.get(fileName));
        }
        
        // Retrieve the Unix mode of the original entry
        /* read */ int mode = entry.getUnixMode();
        
        // Print the Unix mode of the original entry
        System.out.println("Unix mode of 'example.txt': " + mode);
        
        // Add more entries to increase complexity
        entries.add(new ArArchiveEntry("file2.txt", 300L));
        entries.add(new ArArchiveEntry("file3.txt", 400L));
        
        // Update modes for new entries
        for (ArArchiveEntry ent : entries) {
            if (!ent.getName().equals("example.txt")) {
                ent.setUnixMode(755);
            }
        }
        
        // Print updated modes
        System.out.println("Updated Modes:");
        for (ArArchiveEntry ent : entries) {
            System.out.println("File: " + ent.getName() + ", Mode: " + ent.getUnixMode());
        }
    }
}