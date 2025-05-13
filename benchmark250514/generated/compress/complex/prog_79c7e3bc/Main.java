import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        TarArchiveEntry entry = new TarArchiveEntry("dummy");
        List<String> userNames = new ArrayList<>();
        Map<String, Integer> userAccessCount = new HashMap<>();
        
        // Simulate adding user names to a list
        userNames.add("user1");
        userNames.add("user2");
        userNames.add("user3");

        // Simulate recording access counts for users
        userAccessCount.put("user1", 5);
        userAccessCount.put("user2", 3);
        userAccessCount.put("user3", 8);

        // Manipulate user access count
        for (String user : userNames) {
            int count = userAccessCount.get(user);
            userAccessCount.put(user, count + 1);
        }

        // Set the user name for the TarArchiveEntry
        /* write */ entry.setUserName("exampleUser");

        // Perform some unrelated operations
        int totalAccess = 0;
        for (int count : userAccessCount.values()) {
            totalAccess += count;
        }
        System.out.println("Total access: " + totalAccess);

        // Retrieve the user name for the TarArchiveEntry
        /* read */ String userName = entry.getUserName();
        System.out.println("User Name from TarArchiveEntry: " + userName);

        // Further unrelated operations
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }
        
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);
    }
}