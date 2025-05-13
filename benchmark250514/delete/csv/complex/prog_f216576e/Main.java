import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat object
        CSVFormat format = CSVFormat.DEFAULT;
        
        // Example list to demonstrate additional complexity
        List<String> namesList = new ArrayList<>();
        namesList.add("Alice");
        namesList.add("Bob");
        namesList.add("Charlie");
        
        // Apply write method
        /* write */ format = format.withIgnoreHeaderCase(true);

        // Process the list and print names
        for (String name : namesList) {
            System.out.println("Processing name: " + name);
        }
        
        // Create a sample CSVRecord object for demonstration
        String[] header = {"Name", "Age", "Location"};
        String[] values = {"Alice", "30", "Wonderland"};
        CSVRecord record = CSVRecord.parse(values, format, header);

        // Additional logic to manipulate the CSVRecord
        if (record.isMapped("Age")) {
            System.out.println("Age is mapped in the record.");
        }

        // More complex logic to simulate additional processing
        int sumOfAges = 0;
        for (int i = 0; i < 3; i++) {
            sumOfAges += Integer.parseInt(record.get("Age"));
        }
        System.out.println("Sum of ages: " + sumOfAges);

        // Apply read method
        /* read */ boolean isMapped = record.isMapped("name");

        // Print the result
        System.out.println("Is 'name' mapped? " + isMapped);
        
        // Further processing logic
        List<Integer> ageList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            ageList.add(Integer.parseInt(record.get("Age")) + i);
        }
        System.out.println("Age list: " + ageList);
    }
}