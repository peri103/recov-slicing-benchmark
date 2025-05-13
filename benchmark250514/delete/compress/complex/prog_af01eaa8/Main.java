import org.apache.commons.compress.archivers.ar.ArArchiveEntry;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize an ArArchiveEntry object
        ArArchiveEntry entry = new ArArchiveEntry("dummy", 100);

        // Initialize a HashMap to store ArArchiveEntry objects with their usernames
        HashMap<String, ArArchiveEntry> entryMap = new HashMap<>();

        // Initialize a list to store usernames
        ArrayList<String> userNamesList = new ArrayList<>();

        // Use the write method to set the username
        /* write */ entry.setUserName("testUser");

        // Add the entry to the map
        entryMap.put("entry1", entry);

        // Add the username to the list
        userNamesList.add("testUser");

        // Perform some unrelated operations
        for (int i = 0; i < 5; i++) {
            ArArchiveEntry tempEntry = new ArArchiveEntry("dummy" + i, 100 + i);
            tempEntry.setUserName("user" + i);
            entryMap.put("entry" + (i + 2), tempEntry);
            userNamesList.add("user" + i);
        }

        // Retrieve the entry from the map
        ArArchiveEntry retrievedEntry = entryMap.get("entry1");

        // Use the read method to retrieve the username from the original entry
        /* read */ String userName = retrievedEntry.getUserName();

        // Print the retrieved username to ensure the read method worked correctly
        System.out.println(userName);

        // Print all usernames from the list
        for (String name : userNamesList) {
            System.out.println(name);
        }
    }
}