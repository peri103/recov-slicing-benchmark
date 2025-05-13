import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        TarArchiveEntry entry = new TarArchiveEntry("example.txt");
        ArrayList<String> names = new ArrayList<>();
        HashMap<String, Integer> nameLengths = new HashMap<>();

        // Populate names list
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Calculate and store name lengths
        for (String name : names) {
            nameLengths.put(name, name.length());
        }

        // Perform some operations with names
        for (String name : names) {
            System.out.println("Name: " + name + ", Length: " + nameLengths.get(name));
        }

        /* write */ entry.setGroupId(1001);

        // Simulate some complex logic
        int sumOfLengths = 0;
        for (String name : names) {
            sumOfLengths += nameLengths.get(name);
        }
        System.out.println("Total length of all names: " + sumOfLengths);

        // More operations
        String longestName = "";
        for (String name : names) {
            if (name.length() > longestName.length()) {
                longestName = name;
            }
        }
        System.out.println("Longest name: " + longestName);

        /* read */ long groupId = entry.getGroupId();
        System.out.println("Group ID: " + groupId);

        // Additional operations
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            numbers.add(i * 10);
        }

        int totalSum = 0;
        for (Integer number : numbers) {
            totalSum += number;
        }
        System.out.println("Sum of numbers: " + totalSum);
    }
}