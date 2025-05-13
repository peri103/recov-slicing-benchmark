import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize CpioArchiveEntry
        CpioArchiveEntry entry = new CpioArchiveEntry("test.txt", 1000);
        
        // Complex code using ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }
        
        // Complex code using HashMap
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        /* write */ 
        entry.setGroupId(12345);
        
        // More operations
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        
        // Operations on HashMap
        int mapSum = 0;
        for (String key : map.keySet()) {
            mapSum += map.get(key);
        }
        
        // Print results of operations
        System.out.println("Sum of numbers: " + sum);
        System.out.println("Sum of map values: " + mapSum);
        
        // Use another method from CpioArchiveEntry
        entry.setSize(5000);
        System.out.println("Entry size: " + entry.getSize());
        
        /* read */ 
        long groupId = entry.getGroupId();
        System.out.println("Group ID: " + groupId);
        
        // Further complex operations
        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i, numbers.get(i) + mapSum);
        }
        
        // Print modified numbers
        for (int num : numbers) {
            System.out.println("Modified number: " + num);
        }
    }
}