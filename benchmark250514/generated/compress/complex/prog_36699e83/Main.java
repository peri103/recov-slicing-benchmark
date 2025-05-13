import org.apache.commons.compress.archivers.jar.JarArchiveEntry;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create an instance of JarArchiveEntry
        JarArchiveEntry jarEntry = new JarArchiveEntry("example");

        // Create a byte array to set as extra data
        byte[] extraData = new byte[]{1, 2, 3, 4, 5};

        // Use the write method to set the extra data
        /* write */ jarEntry.setExtra(extraData);

        // Create an ArrayList and add some elements
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }

        // Create a HashMap to store string keys and integer values
        HashMap<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        // Perform operations on the ArrayList
        int sum = 0;
        for (Integer num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);

        // Perform operations on the HashMap
        int valueFromMap = map.get("Two");
        System.out.println("Value from map: " + valueFromMap);

        // Use the read method to retrieve the extra data
        /* read */ byte[] retrievedData = jarEntry.getExtra();

        // Print the retrieved data to verify it matches the written data
        System.out.print("Retrieved extra data: ");
        for (byte b : retrievedData) {
            System.out.print(b + " ");
        }
        System.out.println();
        
        // Additional operations on ArrayList and HashMap
        numbers.add(20);
        map.put("Four", 4);

        System.out.println("Updated ArrayList: " + numbers);
        System.out.println("Updated HashMap: " + map);
    }
}