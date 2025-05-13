import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize a TarArchiveEntry object
        TarArchiveEntry entry = new TarArchiveEntry("example.txt");

        // Initialize another TarArchiveEntry object for additional complexity
        TarArchiveEntry anotherEntry = new TarArchiveEntry("anotherExample.txt");

        // Set the group ID using the write method
        /* write */ entry.setGroupId(1001);

        // Use additional API methods to make the program more complex
        anotherEntry.setUserId(2002);
        anotherEntry.setMode(644);

        // Initialize an ArrayList to store TarArchiveEntry objects
        ArrayList<TarArchiveEntry> entriesList = new ArrayList<>();
        entriesList.add(entry);
        entriesList.add(anotherEntry);

        // Initialize a HashMap to store some metadata
        HashMap<String, String> metadata = new HashMap<>();
        metadata.put("creator", "John Doe");
        metadata.put("version", "1.0");

        // Perform some operations on the metadata
        for (String key : metadata.keySet()) {
            System.out.println(key + ": " + metadata.get(key));
        }

        // Perform more operations on the entriesList
        for (TarArchiveEntry e : entriesList) {
            System.out.println("File name: " + e.getName());
            System.out.println("User ID: " + e.getUserId());
        }

        // Read the group ID using the read method
        /* read */ long groupId = entry.getGroupId();

        // Output the group ID to verify the correctness
        System.out.println("Group ID of entry: " + groupId);

        // Additional operations to increase complexity
        for (int i = 0; i < entriesList.size(); i++) {
            TarArchiveEntry e = entriesList.get(i);
            System.out.println("Mode of " + e.getName() + ": " + e.getMode());
        }
    }
}