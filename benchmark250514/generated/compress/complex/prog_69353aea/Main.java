import org.apache.commons.compress.compressors.gzip.GzipParameters;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GzipParameters gzipParams = new GzipParameters();
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();

        // Adding some entries to the map
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        // Adding some entries to the list
        list.add("apple");
        list.add("banana");
        list.add("cherry");

        // Perform operations on map
        if (map.containsKey("two")) {
            int value = map.get("two");
            System.out.println("Value for 'two': " + value);
        }

        // Perform operations on list
        for (String fruit : list) {
            System.out.println("Fruit: " + fruit);
        }

        /* write */ gzipParams.setFilename("example.txt");

        // More operations on map
        map.put("four", 4);
        map.remove("one");

        // More operations on list
        list.add("date");
        list.remove("banana");

        // Final operations before reading
        if (!list.isEmpty()) {
            System.out.println("Last fruit in the list: " + list.get(list.size() - 1));
        }

        /* read */ String filename = gzipParams.getFilename();
        System.out.println("Filename set in GzipParameters: " + filename);

        // Additional complex operations
        for (int i = 0; i < 5; i++) {
            map.put("number_" + i, i * 10);
        }

        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
    }
}