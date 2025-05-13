import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create an instance of CpioArchiveEntry
        CpioArchiveEntry entry = new CpioArchiveEntry();

        // Create a HashMap to store user data
        HashMap<Integer, String> userMap = new HashMap<>();
        userMap.put(1001, "Alice");
        userMap.put(1002, "Bob");

        // Create an ArrayList to store entry objects
        ArrayList<CpioArchiveEntry> entryList = new ArrayList<>();

        // Write operation: Set user ID
        /* write */ entry.setUserId(1001);

        // Add the entry to the list
        entryList.add(entry);

        // Perform some operations on the list
        for (CpioArchiveEntry e : entryList) {
            int id = e.getUserId();
            String name = userMap.get(id);
            System.out.println("User ID: " + id + ", Name: " + name);
        }

        // Create another entry and set its user ID
        CpioArchiveEntry entry2 = new CpioArchiveEntry();
        entry2.setUserId(1002);
        entryList.add(entry2);

        // Read operation: Get user ID from the first entry
        /* read */ int userId = entry.getUserId();

        // Print the user ID to verify the read operation
        System.out.println("Verified User ID: " + userId);

        // Perform additional operations
        for (int i = 0; i < entryList.size(); i++) {
            CpioArchiveEntry e = entryList.get(i);
            System.out.println("Entry " + i + " User ID: " + e.getUserId());
        }
    }
}