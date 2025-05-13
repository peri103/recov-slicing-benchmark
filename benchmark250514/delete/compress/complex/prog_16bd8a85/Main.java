import org.apache.commons.compress.compressors.gzip.GzipParameters;
import java.util.Date;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize GzipParameters and set modification time
        GzipParameters parameters = new GzipParameters();
        Date modificationTime = new Date();
        
        /* write */ parameters.setModificationTime(modificationTime);
        
        // Create and manipulate an ArrayList
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        
        // Perform operations on the ArrayList
        for (int i = 0; i < names.size(); i++) {
            System.out.println("Name: " + names.get(i));
        }
        
        // Create and manipulate a HashMap
        HashMap<String, Integer> nameToAge = new HashMap<>();
        nameToAge.put("Alice", 30);
        nameToAge.put("Bob", 25);
        nameToAge.put("Charlie", 35);
        
        // Retrieve and print values from the HashMap
        for (String name : names) {
            System.out.println(name + " is " + nameToAge.get(name) + " years old.");
        }
        
        // More complex logic
        int sumOfAges = 0;
        for (Integer age : nameToAge.values()) {
            sumOfAges += age;
        }
        System.out.println("Total age: " + sumOfAges);
        
        // Read the modification time from GzipParameters
        /* read */ Date readModificationTime = parameters.getModificationTime();
        System.out.println("Modification Time: " + readModificationTime);
        
        // Additional logic involving arithmetic operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers 1 to 5: " + product);
        
        // Final statement to ensure program complexity
        if (product > 100) {
            System.out.println("Product is greater than 100.");
        } else {
            System.out.println("Product is less than or equal to 100.");
        }
    }
}