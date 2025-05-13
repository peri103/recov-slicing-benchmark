import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat object
        CSVFormat format = CSVFormat.DEFAULT;
        
        // Use the write method to modify the CSVFormat
        /* write */ format = format.withAllowDuplicateHeaderNames(true);

        // Sample CSV record data
        String[] headers = {"name", "age", "name"};
        String[] values = {"Alice", "30", "Bob"};
        
        // Create a CSVRecord object
        CSVRecord record = CSVRecord.parse(Arrays.asList(values), Arrays.asList(headers), format);

        // Additional code to manipulate lists and perform operations
        List<String> namesList = new ArrayList<>();
        namesList.add("Charlie");
        namesList.add("David");
        namesList.add("Eve");

        for (String name : namesList) {
            System.out.println("Processing name: " + name);
        }

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 4: " + sum);

        // Use the read method to check if a specific header is mapped
        /* read */ boolean isMapped = record.isMapped("name");
        
        // Output the result
        System.out.println("Is 'name' header mapped? " + isMapped);

        // Additional complex operations
        List<Integer> numbersList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbersList.add(i * 2);
        }

        int product = 1;
        for (int num : numbersList) {
            product *= num;
        }
        System.out.println("Product of even numbers from 0 to 18: " + product);
    }
}