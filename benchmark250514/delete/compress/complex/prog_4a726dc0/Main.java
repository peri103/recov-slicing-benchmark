import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize CpioArchiveEntry
        CpioArchiveEntry entry = new CpioArchiveEntry("test.txt", 0);
        
        // Initialize an ArrayList and a HashMap
        ArrayList<Integer> numbers = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        
        // Populate ArrayList
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }
        
        // Populate HashMap with some values
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        
        // Perform operations on ArrayList
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);
        
        // Perform operations on HashMap
        int mapSum = 0;
        for (String key : map.keySet()) {
            mapSum += map.get(key);
        }
        System.out.println("Sum of map values: " + mapSum);
        
        // Set group ID in CpioArchiveEntry
        /* write */ entry.setGroupId(1001);
        
        // More operations on ArrayList
        int max = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Maximum number: " + max);
        
        // Retrieve group ID from CpioArchiveEntry
        /* read */ long groupId = entry.getGroupId();
        System.out.println("Group ID: " + groupId);
        
        // Perform additional operations
        int product = 1;
        for (int number : numbers) {
            product *= number;
        }
        System.out.println("Product of numbers: " + product);
        
        // Use HashMap to retrieve a specific value
        if (map.containsKey("two")) {
            System.out.println("Value for 'two': " + map.get("two"));
        }
    }
}