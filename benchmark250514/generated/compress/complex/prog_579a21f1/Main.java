import org.apache.commons.compress.compressors.gzip.GzipParameters;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GzipParameters gzipParameters = new GzipParameters();
        /* write */ gzipParameters.setOperatingSystem(3);

        // Additional complex code
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 5);
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        System.out.println("Sum of numbers: " + sum);

        if (map.containsKey("B")) {
            System.out.println("Value for key 'B': " + map.get("B"));
        }

        // More operations on the map
        map.put("D", 4);
        map.remove("A");

        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        /* read */ int operatingSystem = gzipParameters.getOperatingSystem();
        System.out.println("Operating System value from GzipParameters: " + operatingSystem);

        // Further operations
        numbers.clear();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 2);
        }

        for (int number : numbers) {
            System.out.println("Number: " + number);
        }
    }
}