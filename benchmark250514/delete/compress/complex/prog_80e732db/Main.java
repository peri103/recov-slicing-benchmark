import org.apache.commons.compress.archivers.ar.ArArchiveEntry;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArArchiveEntry entry = new ArArchiveEntry("example.txt", 1000);
        HashMap<String, ArArchiveEntry> archiveMap = new HashMap<>();
        ArrayList<String> userNames = new ArrayList<>();
        
        /* write */ entry.setUserName("testUser");
        
        // Add entry to the map with its name as the key
        archiveMap.put(entry.getName(), entry);
        
        // Add some user names to the list
        userNames.add("user1");
        userNames.add("user2");
        userNames.add("user3");
        
        // Iterate over the userNames list and print them
        for (String user : userNames) {
            System.out.println("User: " + user);
        }
        
        // Retrieve the entry from the map and get its userName
        ArArchiveEntry retrievedEntry = archiveMap.get("example.txt");
        
        /* read */ String userName = retrievedEntry.getUserName();
        
        // Print the retrieved userName
        System.out.println("Retrieved UserName: " + userName);
        
        // Perform some calculations
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i * 10;
        }
        
        // Print the result of the calculations
        System.out.println("Sum: " + sum);
        
        // Modify the userNames list
        userNames.add("newUser");
        userNames.remove("user1");
        
        // Print the modified list
        System.out.println("Modified UserNames: " + userNames);
    }
}