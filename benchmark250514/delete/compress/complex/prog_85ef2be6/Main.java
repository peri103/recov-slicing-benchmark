import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CpioArchiveEntry entry = new CpioArchiveEntry();
        /* write */ entry.setName("exampleName");

        // Additional code to make the program more complex
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        List<String> keys = new ArrayList<>(map.keySet());
        List<Integer> values = new ArrayList<>(map.values());

        int sum = 0;
        for (Integer value : values) {
            sum += value;
        }

        System.out.println("Sum of values: " + sum);

        for (String key : keys) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        // More unrelated code
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 10);
        }

        for (int num : numbers) {
            System.out.println("Number: " + num);
        }

        // Original read operation
        /* read */ String name = entry.getName();
        System.out.println("CpioArchiveEntry Name: " + name);
    }
}