import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Original API usage
        CpioArchiveEntry entry = new CpioArchiveEntry("testfile");

        // Additional logic using HashMap
        HashMap<String, Integer> map = new HashMap<>();
        map.put("key1", 100);
        map.put("key2", 200);
        map.put("key3", 300);

        ArrayList<String> keys = new ArrayList<>(map.keySet());
        for (String key : keys) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        // Additional logic with ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 10);
        }

        for (int number : numbers) {
            System.out.println("Number: " + number);
        }

        // Writing to CpioArchiveEntry
        /* write */ entry.setCrc(12345L);

        // Some unrelated logic
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);

        // Reading from CpioArchiveEntry
        /* read */ long crcValue = entry.getCrc();
        System.out.println("CRC Value: " + crcValue);

        // More unrelated operations
        numbers.add(sum);
        for (int number : numbers) {
            System.out.println("Updated Number: " + number);
        }

        // Demonstrate use of map and list together
        for (String key : keys) {
            numbers.add(map.get(key));
        }
        for (int number : numbers) {
            System.out.println("Final Number: " + number);
        }
    }
}