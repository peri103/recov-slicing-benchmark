import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        TarArchiveEntry entry = new TarArchiveEntry("example.tar");
        Map<String, Integer> userPermissions = new HashMap<>();
        
        // Setting user ID for the TarArchiveEntry
        /* write */ entry.setUserId(12345);

        // Adding some user permissions
        userPermissions.put("read", 1);
        userPermissions.put("write", 2);
        userPermissions.put("execute", 3);

        // Simulate some operations
        int permissionLevel = userPermissions.get("write");
        System.out.println("User permission level for write: " + permissionLevel);

        // Perform some calculations
        int calculationResult = permissionLevel * 10;
        System.out.println("Calculation result: " + calculationResult);

        // Retrieve user ID from the TarArchiveEntry
        /* read */ int userId = entry.getUserId();
        System.out.println("User ID from TarArchiveEntry: " + userId);

        // Further operations using the user ID
        if (userId == 12345) {
            System.out.println("User ID is correct.");
        } else {
            System.out.println("User ID is incorrect.");
        }

        // Loop through permissions and print them
        for (Map.Entry<String, Integer> entryPermission : userPermissions.entrySet()) {
            System.out.println("Permission: " + entryPermission.getKey() + ", Level: " + entryPermission.getValue());
        }
    }
}