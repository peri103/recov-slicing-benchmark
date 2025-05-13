import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        TarArchiveEntry entry = new TarArchiveEntry("example.txt");
        /* write */ entry.setUserName("exampleUser");
        
        ArrayList<String> userList = new ArrayList<>();
        userList.add("user1");
        userList.add("user2");
        userList.add("user3");

        HashMap<String, Integer> userAccessCount = new HashMap<>();
        for (String user : userList) {
            userAccessCount.put(user, user.length());
        }

        for (String user : userList) {
            System.out.println("Access count for " + user + ": " + userAccessCount.get(user));
        }

        // Further operations with userList
        userList.add(entry.getUserName());
        System.out.println("Updated user list: " + userList);

        // Simulating some complex logic
        int totalAccess = 0;
        for (int count : userAccessCount.values()) {
            totalAccess += count;
        }
        System.out.println("Total access count: " + totalAccess);

        // Retrieve the username from the TarArchiveEntry
        /* read */ String userName = entry.getUserName();
        System.out.println("Username from TarArchiveEntry: " + userName);

        // Additional logic to demonstrate complexity
        int maxAccess = 0;
        for (String user : userList) {
            int accessCount = userAccessCount.getOrDefault(user, 0);
            if (accessCount > maxAccess) {
                maxAccess = accessCount;
            }
        }
        System.out.println("Max access count: " + maxAccess);
    }
}