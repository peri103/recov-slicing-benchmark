import org.apache.commons.compress.archivers.ar.ArArchiveEntry;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ArArchiveEntry entry = new ArArchiveEntry("example.txt", 100);
        ArrayList<ArArchiveEntry> archiveList = new ArrayList<>();
        HashMap<String, ArArchiveEntry> archiveMap = new HashMap<>();
        
        // Adding entries to the archive list
        archiveList.add(entry);
        archiveList.add(new ArArchiveEntry("another_file.txt", 200));
        
        // Adding entries to the archive map
        archiveMap.put("exampleEntry", entry);
        archiveMap.put("anotherEntry", new ArArchiveEntry("another_file.txt", 200));
        
        // Modify the link name of the first entry
        /* write */ entry.setLinkName("linked_example.txt");
        
        // Perform operations on the archive list
        for (ArArchiveEntry archiveEntry : archiveList) {
            System.out.println("Archive Entry: " + archiveEntry.getName());
        }
        
        // Retrieve and print the link name from the map
        ArArchiveEntry retrievedEntry = archiveMap.get("exampleEntry");
        System.out.println("Retrieved Entry: " + retrievedEntry.getName());
        
        // Perform operations on the archive map
        archiveMap.forEach((key, value) -> {
            System.out.println("Map Key: " + key + ", Entry Name: " + value.getName());
        });
        
        // Read the link name after various operations
        /* read */ String linkName = entry.getLinkName();
        System.out.println("Link Name: " + linkName);
        
        // Additional operations for complexity
        for (int i = 0; i < archiveList.size(); i++) {
            ArArchiveEntry tempEntry = new ArArchiveEntry("temp_file_" + i + ".txt", i * 50);
            archiveList.add(tempEntry);
            archiveMap.put("tempEntry" + i, tempEntry);
        }
        
        // Print all entries in the archive list
        for (ArArchiveEntry archiveEntry : archiveList) {
            System.out.println("Final Archive Entry: " + archiveEntry.getName());
        }
    }
}