import org.apache.commons.compress.compressors.gzip.GzipParameters;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the GzipParameters object
        GzipParameters gzipParams = new GzipParameters();
        
        // Prepare the extra data to be written
        byte[] extraData = new byte[]{1, 2, 3, 4, 5};
        
        // Write the extra data using setExtra method
        /* write */ gzipParams.setExtra(extraData);
        
        // Create a complex data structure to simulate more operations
        ArrayList<Integer> numbers = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        
        // Populate the ArrayList
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }
        
        // Populate the HashMap
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        
        // Perform some operations on the ArrayList
        for (int num : numbers) {
            if (num % 3 == 0) {
                System.out.println("Divisible by 3: " + num);
            }
        }
        
        // Perform some operations on the HashMap
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
        
        // Some additional logic to simulate complexity
        int sum = 0;
        for (int value : numbers) {
            sum += value;
        }
        System.out.println("Sum of numbers: " + sum);
        
        // Read the extra data using getExtra method
        /* read */ byte[] readData = gzipParams.getExtra();
        
        // Print the read data to verify it matches the written data
        System.out.print("Extra data: ");
        for (byte b : readData) {
            System.out.print(b + " ");
        }
        System.out.println();
    }
}