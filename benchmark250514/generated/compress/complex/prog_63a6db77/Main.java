import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CpioArchiveEntry entry = new CpioArchiveEntry("testEntry");
        /* write */ entry.setSize(1024L);

        // Additional complex code
        HashMap<String, Integer> map = new HashMap<>();
        map.put("key1", 100);
        map.put("key2", 200);

        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");

        int sum = 0;
        for (String key : map.keySet()) {
            sum += map.get(key);
        }

        for (String str : list) {
            System.out.println(str);
        }

        System.out.println("Sum of map values: " + sum);

        // More operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers 1 to 5: " + product);

        // Read operation
        /* read */ long size = entry.getSize();
        System.out.println("Size of CpioArchiveEntry: " + size);

        // Further operations
        int factorial = 1;
        for (int i = 1; i <= 3; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of 3: " + factorial);
    }
}