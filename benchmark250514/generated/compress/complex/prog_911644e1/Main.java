import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        /* write */ entry.setUserId(1001);

        // Creating and populating a HashMap
        HashMap<String, Integer> userMap = new HashMap<>();
        userMap.put("Alice", 1002);
        userMap.put("Bob", 1003);

        // Adding more users to the map
        for (int i = 4; i <= 6; i++) {
            userMap.put("User" + i, 1000 + i);
        }

        // Creating and populating an ArrayList
        ArrayList<Integer> userIds = new ArrayList<>();
        userIds.add(1005);
        userIds.add(1006);

        // Adding user IDs from the map to the list
        for (String key : userMap.keySet()) {
            userIds.add(userMap.get(key));
        }

        // Performing some operations on the list
        int sum = 0;
        for (int id : userIds) {
            sum += id;
        }
        System.out.println("Sum of user IDs: " + sum);

        // Retrieving the user ID set earlier
        /* read */ int userId = entry.getUserId();
        System.out.println("Original User ID: " + userId);

        // Additional operations on the list
        for (int i = 0; i < userIds.size(); i++) {
            System.out.println("User ID at index " + i + ": " + userIds.get(i));
        }
    }
}