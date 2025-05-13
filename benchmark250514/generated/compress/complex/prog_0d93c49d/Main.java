import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize a ZipArchiveEntry
        ZipArchiveEntry zipEntry = new ZipArchiveEntry("example.txt");
        byte[] extraData = {1, 2, 3, 4, 5};
        
        // Initialize a HashMap to simulate a complex operation
        HashMap<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        
        // Use ArrayList to store some values
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        
        // Perform some operations on the map
        int sum = 0;
        for (String key : map.keySet()) {
            sum += map.get(key);
        }
        
        // Perform some operations on the list
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + sum);
        }
        
        // Write the extra data to the ZipArchiveEntry
        /* write */ zipEntry.setExtra(extraData);
        
        // Additional operations on the list
        list.add(sum);
        for (int value : list) {
            System.out.println("List value: " + value);
        }
        
        // Read the extra data from the ZipArchiveEntry
        /* read */ byte[] readExtraData = zipEntry.getExtra();
        
        // Print the read extra data to verify it matches what was written
        System.out.print("Read extra data: ");
        for (byte b : readExtraData) {
            System.out.print(b + " ");
        }
        System.out.println();
        
        // Perform some more operations on the map
        map.put("four", 4);
        map.put("five", 5);
        
        // Recalculate the sum with new map entries
        sum = 0;
        for (String key : map.keySet()) {
            sum += map.get(key);
        }
        
        // Print the final sum
        System.out.println("Final sum from map: " + sum);
    }
}