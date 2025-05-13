import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        CpioArchiveEntry entry = new CpioArchiveEntry("file.txt");
        ArrayList<String> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        // Add some initial data to the list and map
        list.add("Initial1");
        list.add("Initial2");
        map.put("Key1", 100);
        map.put("Key2", 200);

        // Modify the entry name
        /* write */ entry.setName("newfile.txt");

        // Perform some operations on the list
        for (int i = 0; i < 3; i++) {
            list.add("Value" + i);
        }

        // Perform some operations on the map
        map.put("Key3", 300);
        int sum = 0;
        for (int value : map.values()) {
            sum += value;
        }

        // Print the sum of map values
        System.out.println("Sum of map values: " + sum);

        // More operations on the list
        for (String item : list) {
            System.out.println("List item: " + item);
        }

        // Retrieve the entry name
        /* read */ String name = entry.getName();
        System.out.println("Entry name: " + name);

        // Additional complex operations
        list.remove("Initial1");
        map.remove("Key1");
        
        for (String key : map.keySet()) {
            System.out.println("Map key: " + key + ", value: " + map.get(key));
        }
    }
}