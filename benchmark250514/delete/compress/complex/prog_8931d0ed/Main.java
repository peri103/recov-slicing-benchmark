import org.apache.commons.compress.archivers.ar.ArArchiveEntry;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize an ArArchiveEntry
        ArArchiveEntry entry = new ArArchiveEntry("initialName", 0);

        // Initialize a HashMap to store entries with their sizes
        HashMap<String, Integer> entrySizeMap = new HashMap<>();

        // Add some entries to the map
        entrySizeMap.put("entry1", 100);
        entrySizeMap.put("entry2", 200);

        // Initialize an ArrayList to store entry names
        ArrayList<String> entryNames = new ArrayList<>();

        // Add names from the map to the list
        for (String key : entrySizeMap.keySet()) {
            entryNames.add(key);
        }

        // Set a new name for the entry
        /* write */ entry.setName("newName");

        // Add the new name to the list
        entryNames.add(entry.getName());

        // Print all entry names
        System.out.println("Entry names:");
        for (String name : entryNames) {
            System.out.println(name);
        }

        // Calculate total size of all entries in the map
        int totalSize = 0;
        for (int size : entrySizeMap.values()) {
            totalSize += size;
        }
        System.out.println("Total size of entries: " + totalSize);

        // Retrieve and print the name of the entry
        /* read */ String name = entry.getName();
        System.out.println("Retrieved entry name: " + name);

        // Add more complexity with a loop and condition
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                System.out.println("Even index: " + i);
            } else {
                System.out.println("Odd index: " + i);
            }
        }
    }
}