import org.apache.commons.compress.archivers.ar.ArArchiveEntry;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize ArArchiveEntry
        ArArchiveEntry entry = new ArArchiveEntry("example", 100);
        
        // Initialize a HashMap to store multiple ArArchiveEntry objects
        HashMap<String, ArArchiveEntry> archiveMap = new HashMap<>();
        archiveMap.put("entry1", entry);
        
        // Initialize another ArArchiveEntry and set its properties
        ArArchiveEntry entry2 = new ArArchiveEntry("example2", 200);
        entry2.setGroupId(54321);
        archiveMap.put("entry2", entry2);
        
        // Perform unrelated operations with an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 10);
        }
        
        // Print numbers from the ArrayList
        for (int num : numbers) {
            System.out.println(num);
        }
        
        // Set the group ID for the first entry
        /* write */ entry.setGroupId(12345);
        
        // Perform some calculations and operations
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);
        
        // Retrieve and print the group ID of the first entry
        /* read */ long groupId = entry.getGroupId();
        System.out.println("Group ID of entry1: " + groupId);
        
        // Retrieve and print the group ID of the second entry
        long groupId2 = archiveMap.get("entry2").getGroupId();
        System.out.println("Group ID of entry2: " + groupId2);
        
        // Additional operations with the HashMap
        for (String key : archiveMap.keySet()) {
            ArArchiveEntry currentEntry = archiveMap.get(key);
            System.out.println("Entry name: " + currentEntry.getName() + ", Size: " + currentEntry.getSize());
        }
    }
}