import org.apache.commons.compress.archivers.dump.DumpArchiveEntry;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize DumpArchiveEntry and set extra data
        DumpArchiveEntry entry = new DumpArchiveEntry();
        byte[] extraData = {1, 2, 3, 4, 5};
        
        /* write */ entry.setExtra(extraData);

        // Create an ArrayList and populate it with some integers
        ArrayList<Integer> intList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            intList.add(i * 2);
        }

        // Create a HashMap to store some key-value pairs
        HashMap<String, String> map = new HashMap<>();
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");

        // Perform some operations on the ArrayList
        for (int i = 0; i < intList.size(); i++) {
            intList.set(i, intList.get(i) + 1);
        }

        // Access and print a value from the HashMap
        String valueFromMap = map.get("two");
        System.out.println("Value from map: " + valueFromMap);

        // Access the extra data from DumpArchiveEntry
        /* read */ byte[] readExtraData = entry.getExtra();

        // Print the extra data
        System.out.print("Extra data: ");
        for (byte b : readExtraData) {
            System.out.print(b + " ");
        }
        System.out.println();

        // Perform more operations with the ArrayList
        int sum = 0;
        for (int num : intList) {
            sum += num;
        }
        System.out.println("Sum of elements in intList: " + sum);
    }
}