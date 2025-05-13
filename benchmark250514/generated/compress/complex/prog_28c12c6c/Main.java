import org.apache.commons.compress.compressors.gzip.GzipParameters;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GzipParameters gzipParams = new GzipParameters();
        /* write */ gzipParams.setOperatingSystem(3);

        // Introducing a HashMap to store some values
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Linux", 1);
        map.put("Windows", 2);
        map.put("MacOS", 3);

        // Performing operations on the HashMap
        for (String key : map.keySet()) {
            System.out.println("Operating System: " + key + ", Code: " + map.get(key));
        }

        // Introducing an ArrayList to store some integers
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 10);
        }

        // Performing operations on the ArrayList
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }

        // More complex logic
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);

        // Reading the operating system value set earlier
        /* read */ int operatingSystem = gzipParams.getOperatingSystem();
        System.out.println("Operating System Code: " + operatingSystem);

        // Additional logic
        int product = 1;
        for (int num : numbers) {
            product *= num;
        }
        System.out.println("Product of numbers: " + product);
    }
}