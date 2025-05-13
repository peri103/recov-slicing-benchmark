import org.apache.commons.compress.archivers.dump.DumpArchiveEntry;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        DumpArchiveEntry entry = new DumpArchiveEntry();
        /* write */ entry.setSize(1024L);

        // Additional complex logic
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 100);
        }
        
        HashMap<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }

        int mapSum = 0;
        for (String key : map.keySet()) {
            mapSum += map.get(key);
        }

        // Some unrelated operations
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("Number: " + numbers.get(i));
        }

        System.out.println("Sum of numbers: " + sum);
        System.out.println("Sum of map values: " + mapSum);

        // More complex logic
        if (sum > 1000) {
            map.put("four", 4);
        } else {
            map.remove("one");
        }

        // Accessing the original write-read pair
        /* read */ long size = entry.getSize();
        System.out.println("Size from DumpArchiveEntry: " + size);
    }
}