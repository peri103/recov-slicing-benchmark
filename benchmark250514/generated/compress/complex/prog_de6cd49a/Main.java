import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize TarArchiveEntry
        TarArchiveEntry entry = new TarArchiveEntry("example.txt");
        
        // Initialize additional data structures
        ArrayList<String> userNames = new ArrayList<>();
        HashMap<String, Integer> userAccessCount = new HashMap<>();

        // Add some users to the list
        userNames.add("user1");
        userNames.add("user2");
        userNames.add("user3");
        
        // Set userName for the entry
        /* write */ entry.setUserName("testUser");

        // Simulate some operations
        for (String user : userNames) {
            userAccessCount.put(user, user.length());
        }

        // Perform some unrelated operations
        int totalAccessCount = 0;
        for (Integer count : userAccessCount.values()) {
            totalAccessCount += count;
        }
        System.out.println("Total Access Count: " + totalAccessCount);

        // Retrieve and print the userName from the entry
        /* read */ String userName = entry.getUserName();
        System.out.println("User Name from TarArchiveEntry: " + userName);

        // Additional operations
        if (userNames.contains(userName)) {
            System.out.println(userName + " is in the user list.");
        } else {
            System.out.println(userName + " is not in the user list.");
        }
    }
}