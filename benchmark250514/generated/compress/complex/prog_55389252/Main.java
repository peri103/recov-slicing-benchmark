import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        TarArchiveEntry entry = new TarArchiveEntry("dummy");
        ArrayList<String> userNames = new ArrayList<>();
        HashMap<String, Integer> userMap = new HashMap<>();

        // Adding some dummy data to the list and map
        userNames.add("user1");
        userNames.add("user2");
        userMap.put("user1", 1001);
        userMap.put("user2", 1002);

        /* write */ entry.setUserName("testuser");
        
        // Manipulate the list and map
        userNames.add("testuser");
        userMap.put("testuser", 1003);

        // Perform some operations on the list
        for (String userName : userNames) {
            System.out.println("Processing user: " + userName);
        }

        // Perform operations on the map
        for (String userName : userMap.keySet()) {
            System.out.println("User: " + userName + ", ID: " + userMap.get(userName));
        }

        // Additional logic to make the code more complex
        int sumOfIds = 0;
        for (int id : userMap.values()) {
            sumOfIds += id;
        }
        System.out.println("Sum of User IDs: " + sumOfIds);

        /* read */ String username = entry.getUserName();
        System.out.println("Retrieved username from TarArchiveEntry: " + username);

        // More operations to increase complexity
        ArrayList<Integer> idList = new ArrayList<>();
        for (int id : userMap.values()) {
            idList.add(id);
        }

        // Print the IDs
        for (int id : idList) {
            System.out.println("ID: " + id);
        }
    }
}