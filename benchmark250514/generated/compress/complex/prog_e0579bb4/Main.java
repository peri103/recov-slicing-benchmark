import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ZipArchiveEntry zipEntry = new ZipArchiveEntry("example.txt");
        byte[] extraData = {1, 2, 3, 4, 5};

        /* write */ zipEntry.setExtra(extraData);

        // Additional complexity: Use ArrayList and HashMap
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }

        HashMap<String, Integer> map = new HashMap<>();
        for (int num : numbers) {
            map.put("Number_" + num, num);
        }

        // Complex logic with loops and conditionals
        for (String key : map.keySet()) {
            if (map.get(key) % 4 == 0) {
                System.out.println(key + " is divisible by 4");
            } else {
                System.out.println(key + " is not divisible by 4");
            }
        }

        // More operations before reading the extra data from zipEntry
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);

        /* read */ byte[] retrievedData = zipEntry.getExtra();

        // Printing retrieved data
        System.out.print("Retrieved extra data: ");
        for (byte b : retrievedData) {
            System.out.print(b + " ");
        }
        System.out.println();

        // Additional operations after reading
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            strings.add("String_" + i);
        }

        for (String str : strings) {
            System.out.println(str);
        }
    }
}