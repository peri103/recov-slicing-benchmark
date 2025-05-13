import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        CpioArchiveEntry entry = new CpioArchiveEntry("test");
        ArrayList<Integer> numbers = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        // Populate the map with some values
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        // Add numbers to the list
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 10);
        }

        // Perform a calculation
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        // Use the map to find a value
        int valueFromMap = map.get("two");
        System.out.println("Value from map: " + valueFromMap);

        // Set external attributes in the CpioArchiveEntry
        /* write */ entry.setExternalAttributes(12345L);

        // More unrelated code
        double average = sum / (double) numbers.size();
        System.out.println("Average: " + average);

        // Retrieve the external attributes from the CpioArchiveEntry
        /* read */ long value = entry.getExternalAttributes();
        System.out.println("External Attributes: " + value);

        // Print numbers from the list
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }
    }
}