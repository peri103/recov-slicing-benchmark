import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        TarArchiveEntry entry = new TarArchiveEntry("example.tar");
        /* write */ entry.setGroupName("developers");

        // Additional code to make the program more complex
        Map<String, String> userMap = new HashMap<>();
        userMap.put("user1", "admin");
        userMap.put("user2", "guest");

        for (Map.Entry<String, String> userEntry : userMap.entrySet()) {
            System.out.println("Username: " + userEntry.getKey() + ", Role: " + userEntry.getValue());
        }

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // More unrelated code
        String[] colors = {"Red", "Green", "Blue"};
        for (String color : colors) {
            System.out.println("Color: " + color);
        }

        // Read the group name from the TarArchiveEntry
        /* read */ String groupName = entry.getGroupName();
        System.out.println(groupName);

        // Further unrelated code
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }
    }
}