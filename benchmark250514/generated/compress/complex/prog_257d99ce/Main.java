import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TarArchiveEntry entry = new TarArchiveEntry("example.txt");
        ArrayList<Integer> userIdList = new ArrayList<>();
        
        /* write */ entry.setUserId(1001);
        
        // Adding more complexity with additional operations
        for (int i = 0; i < 5; i++) {
            userIdList.add(1000 + i);
        }
        
        for (int i = 0; i < userIdList.size(); i++) {
            if (userIdList.get(i) == 1001) {
                System.out.println("User ID 1001 found in list.");
            }
        }
        
        // Simulate some unrelated operations
        int sum = 0;
        for (int id : userIdList) {
            sum += id;
        }
        System.out.println("Sum of user IDs: " + sum);
        
        // More operations before reading the value
        boolean isUserIdPresent = userIdList.contains(entry.getUserId());
        System.out.println("Is User ID present: " + isUserIdPresent);
        
        /* read */ int userId = entry.getUserId();
        System.out.println("User ID: " + userId);
        
        // Continue with more operations
        userIdList.add(userId);
        
        for (int id : userIdList) {
            System.out.println("User ID in list: " + id);
        }
    }
}