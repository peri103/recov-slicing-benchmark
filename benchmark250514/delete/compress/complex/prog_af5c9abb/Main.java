import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        CpioArchiveEntry entry = new CpioArchiveEntry("testfile");
        /* write */ entry.setGroupId(1001);
        
        // Additional code to make the program more complex
        Map<String, Integer> userPermissions = new HashMap<>();
        userPermissions.put("admin", 777);
        userPermissions.put("guest", 644);

        int adminPermissions = userPermissions.get("admin");
        System.out.println("Admin permissions: " + adminPermissions);

        for (Map.Entry<String, Integer> permission : userPermissions.entrySet()) {
            System.out.println(permission.getKey() + " has permissions: " + permission.getValue());
        }

        // Additional unrelated operations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10 is: " + sum);

        // More complex logic
        int[] numbers = {1, 2, 3, 4, 5};
        int product = 1;
        for (int number : numbers) {
            product *= number;
        }
        System.out.println("Product of array elements: " + product);

        /* read */ long groupId = entry.getGroupId();
        System.out.println("Group ID: " + groupId);
    }
}