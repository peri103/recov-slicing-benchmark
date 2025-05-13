import org.apache.commons.compress.compressors.gzip.GzipParameters;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize GzipParameters object
        GzipParameters gzipParameters = new GzipParameters();
        
        // Create a byte array to use with setExtra and getExtra methods
        byte[] extraData = new byte[]{1, 2, 3, 4, 5};
        
        /* write */ gzipParameters.setExtra(extraData);
        
        // Create a list and a map to make the program more complex
        List<Integer> numbers = new ArrayList<>();
        Map<String, Integer> nameToAge = new HashMap<>();
        
        // Populate the list and map
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }
        
        nameToAge.put("Alice", 30);
        nameToAge.put("Bob", 25);
        nameToAge.put("Charlie", 35);
        
        // Perform some operations on the list and map
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        
        int ageSum = 0;
        for (String name : nameToAge.keySet()) {
            ageSum += nameToAge.get(name);
        }
        
        // Print the results of operations
        System.out.println("Sum of numbers: " + sum);
        System.out.println("Sum of ages: " + ageSum);
        
        // Further processing
        int maxNumber = numbers.stream().max(Integer::compareTo).orElse(0);
        System.out.println("Max number: " + maxNumber);
        
        int minAge = nameToAge.values().stream().min(Integer::compareTo).orElse(0);
        System.out.println("Min age: " + minAge);
        
        /* read */ byte[] readData = gzipParameters.getExtra();
        
        // Print the read data to verify it matches the written data
        System.out.print("Read extra data: ");
        for (byte b : readData) {
            System.out.print(b + " ");
        }
        System.out.println();
        
        // Additional logic to make the program more complex
        List<String> names = new ArrayList<>(nameToAge.keySet());
        names.sort(String::compareTo);
        
        System.out.println("Sorted names: " + names);
        
        int product = numbers.stream().reduce(1, (a, b) -> a * b);
        System.out.println("Product of numbers: " + product);
    }
}