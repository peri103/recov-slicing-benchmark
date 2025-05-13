import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        TarArchiveEntry entry = new TarArchiveEntry("example.txt");
        /* write */ entry.setUserId(12345);

        // Unrelated complex code
        Map<String, Integer> userMap = new HashMap<>();
        userMap.put("Alice", 1001);
        userMap.put("Bob", 1002);
        userMap.put("Charlie", 1003);

        for (Map.Entry<String, Integer> user : userMap.entrySet()) {
            System.out.println("User: " + user.getKey() + ", ID: " + user.getValue());
        }

        // Manipulating TarArchiveEntry object further
        entry.setGroupId(67890);
        entry.setMode(0755);
        entry.setSize(1024);

        int groupId = entry.getGroupId();
        int mode = entry.getMode();
        long size = entry.getSize();

        System.out.println("Group ID: " + groupId);
        System.out.println("Mode: " + mode);
        System.out.println("Size: " + size);

        // Further unrelated code
        int total = 0;
        for (int id : userMap.values()) {
            total += id;
        }
        System.out.println("Total User IDs: " + total);

        /* read */ int userId = entry.getUserId();
        System.out.println("User ID: " + userId);

        // Additional unrelated logic
        if (userId == 12345) {
            System.out.println("User ID matches expected value.");
        }
    }
}