import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        CpioArchiveEntry entry = new CpioArchiveEntry("test.txt", 100);
        long lastModifiedTime = System.currentTimeMillis();
        /* write */ entry.setLastModified(lastModifiedTime);

        // Additional complex code
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }
        
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.size(); i++) {
            map.put("Key" + i, numbers.get(i));
        }

        int sum = 0;
        for (int value : numbers) {
            sum += value;
        }
        System.out.println("Sum of numbers: " + sum);

        // Accessing map values
        for (Map.Entry<String, Integer> entrySet : map.entrySet()) {
            System.out.println("Key: " + entrySet.getKey() + ", Value: " + entrySet.getValue());
        }

        // More complex operations
        int max = Integer.MIN_VALUE;
        for (int value : numbers) {
            if (value > max) {
                max = value;
            }
        }
        System.out.println("Max value: " + max);

        // Read the last modified time from the entry
        /* read */ long readTime = entry.getLastModified();
        System.out.println("Last Modified Time: " + readTime);

        // Perform some calculations
        double average = sum / (double) numbers.size();
        System.out.println("Average: " + average);
    }
}