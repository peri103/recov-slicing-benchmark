import org.apache.commons.compress.archivers.jar.JarArchiveEntry;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize a JarArchiveEntry object
        JarArchiveEntry jarEntry = new JarArchiveEntry("example.jar");

        // Create a byte array to set as extra data
        byte[] extraData = {1, 2, 3, 4, 5};

        /* write */ jarEntry.setExtra(extraData);

        // Create a HashMap to store some data
        HashMap<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");

        // Create an ArrayList and populate it with data
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }

        // Perform some operations on the ArrayList
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }

        // Retrieve data from the HashMap
        String value1 = map.get("key1");
        System.out.println("Retrieved from map: " + value1);

        // Perform additional operations unrelated to the JarArchiveEntry
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);

        // Retrieve the extra data from the JarArchiveEntry
        /* read */ byte[] retrievedData = jarEntry.getExtra();

        // Print the retrieved extra data to verify it matches what was set
        System.out.print("Retrieved extra data: ");
        for (byte b : retrievedData) {
            System.out.print(b + " ");
        }
    }
}