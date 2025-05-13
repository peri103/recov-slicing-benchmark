import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        TarArchiveEntry entry = new TarArchiveEntry("example");
        Random random = new Random();
        Map<String, Integer> userIdMap = new HashMap<>();
        
        // Initialize some user data
        for (int i = 0; i < 5; i++) {
            userIdMap.put("user" + i, random.nextInt(1000));
        }
        
        // Perform some operations on the user data
        for (Map.Entry<String, Integer> userEntry : userIdMap.entrySet()) {
            System.out.println("User: " + userEntry.getKey() + ", ID: " + userEntry.getValue());
        }
        
        // Set the user ID using the TarArchiveEntry API
        /* write */ entry.setUserId(1234);
        
        // More complex logic
        int sum = 0;
        for (int value : userIdMap.values()) {
            sum += value;
        }
        System.out.println("Sum of user IDs: " + sum);
        
        // Retrieve the user ID using the TarArchiveEntry API
        /* read */ int userId = entry.getUserId();
        System.out.println("Retrieved User ID: " + userId);
        
        // Further processing
        if (userId > 1000) {
            System.out.println("User ID is greater than 1000.");
        } else {
            System.out.println("User ID is less than or equal to 1000.");
        }
        
        // Additional unrelated logic
        int maxId = Integer.MIN_VALUE;
        for (int id : userIdMap.values()) {
            if (id > maxId) {
                maxId = id;
            }
        }
        System.out.println("Maximum User ID in map: " + maxId);
    }
}