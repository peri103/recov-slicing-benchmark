import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        CpioArchiveEntry entry = new CpioArchiveEntry("example.txt");
        /* write */ entry.setSize(1024);

        // Additional complex operations
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 100);
        }

        Map<String, Integer> dataMap = new HashMap<>();
        for (int i = 0; i < numbers.size(); i++) {
            dataMap.put("Key" + i, numbers.get(i));
        }

        int sum = 0;
        for (Integer value : dataMap.values()) {
            sum += value;
        }

        // More operations with numbers
        ArrayList<Integer> squaredNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            squaredNumbers.add(number * number);
        }

        for (int i = 0; i < squaredNumbers.size(); i++) {
            System.out.println("Squared value: " + squaredNumbers.get(i));
        }

        /* read */ long size = entry.getSize();
        System.out.println("CpioArchiveEntry size: " + size);

        // Additional complex operations with dataMap
        for (Map.Entry<String, Integer> entrySet : dataMap.entrySet()) {
            System.out.println(entrySet.getKey() + ": " + entrySet.getValue());
        }
    }
}