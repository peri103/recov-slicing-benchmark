import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the CpioArchiveEntry object
        CpioArchiveEntry entry = new CpioArchiveEntry();

        // Define the extra data to be set
        byte[] extraData = new byte[]{1, 2, 3, 4, 5};

        // Write the extra data to the entry
        /* write */ entry.setExtra(extraData);

        // Create a list and a map to perform additional operations
        ArrayList<Integer> numberList = new ArrayList<>();
        HashMap<String, Integer> numberMap = new HashMap<>();

        // Populate the list with numbers
        for (int i = 0; i < 10; i++) {
            numberList.add(i * 10);
        }

        // Populate the map with some key-value pairs
        numberMap.put("One", 1);
        numberMap.put("Two", 2);
        numberMap.put("Three", 3);

        // Perform some operations on the list
        int sum = 0;
        for (int num : numberList) {
            sum += num;
        }
        System.out.println("Sum of numbers in the list: " + sum);

        // Perform some operations on the map
        for (String key : numberMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + numberMap.get(key));
        }

        // Read the extra data from the entry
        /* read */ byte[] readData = entry.getExtra();

        // Print the read data to verify it matches the written data
        System.out.print("Extra data: ");
        for (byte b : readData) {
            System.out.print(b + " ");
        }
        System.out.println();

        // Additional computation
        int product = 1;
        for (int num : numberList) {
            if (num != 0) {
                product *= num;
            }
        }
        System.out.println("Product of non-zero numbers in the list: " + product);
    }
}