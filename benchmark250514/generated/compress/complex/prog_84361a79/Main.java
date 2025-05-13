import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize a TarArchiveEntry and set its group ID
        TarArchiveEntry tarEntry = new TarArchiveEntry("example.txt");
        /* write */ tarEntry.setGroupId(1001);
        
        // Create a HashMap to simulate storing metadata
        HashMap<String, String> metadata = new HashMap<>();
        metadata.put("filename", "example.txt");
        metadata.put("owner", "user123");
        metadata.put("permissions", "rw-r--r--");
        
        // Perform some operations on metadata
        if (metadata.containsKey("filename")) {
            System.out.println("Metadata contains filename.");
        }
        
        // Create another TarArchiveEntry and perform operations
        TarArchiveEntry anotherEntry = new TarArchiveEntry("another_example.txt");
        anotherEntry.setSize(2048);
        System.out.println("Size of anotherEntry: " + anotherEntry.getSize());
        
        // Initialize an ArrayList to store TarArchiveEntry objects
        ArrayList<TarArchiveEntry> archiveList = new ArrayList<>();
        archiveList.add(tarEntry);
        archiveList.add(anotherEntry);
        
        // Iterate over archiveList and print details
        for (TarArchiveEntry entry : archiveList) {
            System.out.println("Entry Name: " + entry.getName());
            System.out.println("Entry Size: " + entry.getSize());
        }
        
        // Read the group ID from the original TarArchiveEntry
        /* read */ long groupId = tarEntry.getGroupId();
        System.out.println("Group ID of tarEntry: " + groupId);
        
        // Perform some unrelated operations
        for (int i = 0; i < 5; i++) {
            System.out.println("Unrelated operation: " + i);
        }
        
        // Add more entries to the archiveList
        for (int i = 0; i < 3; i++) {
            TarArchiveEntry tempEntry = new TarArchiveEntry("temp_" + i + ".txt");
            tempEntry.setGroupId(1000 + i);
            archiveList.add(tempEntry);
        }
        
        // Print the group IDs of all entries
        for (TarArchiveEntry entry : archiveList) {
            System.out.println("Group ID of " + entry.getName() + ": " + entry.getGroupId());
        }
    }
}