import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        User user = new User("Charlie", 303);
        user.assignUserIdInEntry(12345);

        // Additional unrelated code to increase complexity
        Map<String, Integer> userMap = new HashMap<>();
        userMap.put("Alice", 101);
        userMap.put("Bob", 202);
        userMap.put("Charlie", 303);

        User.printUserDetails(userMap);

        // More complex logic
        StringBuilder userInfo = new StringBuilder();
        for (String name : userMap.keySet()) {
            userInfo.append(name).append(" ");
        }
        System.out.println("User names: " + userInfo.toString().trim());

        /* read */ int userId = user.retrieveUserIdFromEntry();
        System.out.println("User ID from DumpArchiveEntry: " + userId);
    }
}