import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize a CpioArchiveEntry
        CpioArchiveEntry entry = new CpioArchiveEntry("example.txt");

        // Set the last modified time to a specific value
        long lastModifiedTime = 1625097600000L; // Example timestamp
        /* write */ entry.setLastModified(lastModifiedTime);

        // Initialize a list and a map
        ArrayList<String> namesList = new ArrayList<>();
        HashMap<String, Integer> nameAgeMap = new HashMap<>();

        // Add elements to the list and the map
        namesList.add("Alice");
        namesList.add("Bob");
        nameAgeMap.put("Alice", 30);
        nameAgeMap.put("Bob", 25);

        // Perform some operations on the list and the map
        for (String name : namesList) {
            if (nameAgeMap.containsKey(name)) {
                int age = nameAgeMap.get(name);
                System.out.println(name + " is " + age + " years old.");
            }
        }

        // More complex operations
        int sumOfAges = 0;
        for (String name : namesList) {
            if (nameAgeMap.containsKey(name)) {
                sumOfAges += nameAgeMap.get(name);
            }
        }
        System.out.println("Total age: " + sumOfAges);

        // Retrieve the last modified time
        /* read */ long retrievedLastModifiedTime = entry.getLastModified();

        // Output the retrieved last modified time
        System.out.println("Last Modified Time: " + retrievedLastModifiedTime);

        // Additional operations on the list
        namesList.add("Charlie");
        nameAgeMap.put("Charlie", 28);

        for (String name : namesList) {
            System.out.println("Hello, " + name + "!");
        }
    }
}