import org.apache.commons.compress.compressors.gzip.GzipParameters;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        GzipParameters gzipParameters = new GzipParameters();
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();

        // Adding elements to the map
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        // Adding elements to the list
        list.add("Alpha");
        list.add("Beta");
        list.add("Gamma");

        // Perform some operations on the map
        if (map.containsKey("Two")) {
            int value = map.get("Two");
            System.out.println("Value for 'Two': " + value);
        }

        // Perform some operations on the list
        for (String str : list) {
            System.out.println("List element: " + str);
        }

        /* write */ gzipParameters.setFilename("example.txt");

        // More operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        // More operations on the map
        map.put("Four", 4);
        if (map.containsKey("Four")) {
            System.out.println("Map now contains 'Four' with value: " + map.get("Four"));
        }

        // More operations on the list
        list.add("Delta");
        System.out.println("New element added to the list: " + list.get(list.size() - 1));

        /* read */ String filename = gzipParameters.getFilename();
        System.out.println("Gzip filename: " + filename);
    }
}