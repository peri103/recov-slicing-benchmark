import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        TarArchiveEntry tarEntry = new TarArchiveEntry("example");
        ArrayList<String> namesList = new ArrayList<>();
        HashMap<String, Integer> nameCountMap = new HashMap<>();

        // Add some names to the list
        namesList.add("Alice");
        namesList.add("Bob");
        namesList.add("Charlie");

        // Count occurrences of each name
        for (String name : namesList) {
            nameCountMap.put(name, nameCountMap.getOrDefault(name, 0) + 1);
        }

        // Some unrelated operations
        int totalNames = namesList.size();
        System.out.println("Total names: " + totalNames);

        // Set the group name using the write method
        /* write */ tarEntry.setGroupName("myGroup");

        // Perform more unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        // Retrieve the group name using the read method
        /* read */ String groupName = tarEntry.getGroupName();
        System.out.println("Group Name: " + groupName);

        // Print the name count map
        System.out.println("Name counts: " + nameCountMap);

        // Additional logic to manipulate the list
        namesList.add("David");
        namesList.remove("Alice");
        System.out.println("Updated names list: " + namesList);
    }
}