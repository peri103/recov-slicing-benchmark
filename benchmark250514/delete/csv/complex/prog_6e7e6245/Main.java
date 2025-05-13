import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with trimming enabled
        CSVFormat csvFormat = CSVFormat.DEFAULT;
        /* write */ csvFormat = csvFormat.withTrim();
        
        // Demonstrate using a HashMap for unrelated operations
        Map<String, Integer> ageMap = new HashMap<>();
        ageMap.put("John", 30);
        ageMap.put("Alice", 25);
        
        // Print all ages from the map
        for (String name : ageMap.keySet()) {
            System.out.println(name + "'s age is " + ageMap.get(name));
        }
        
        // Create a CSVRecord for demonstration
        String[] headers = {"Name", "Age", "Country"};
        String[] values = {"John", "30", "USA"};
        CSVRecord record = new CSVRecord(null, values, headers, null, null, 0, 0, 0);

        // Perform some unrelated operations
        int totalAge = 0;
        for (Integer age : ageMap.values()) {
            totalAge += age;
        }
        System.out.println("Total age is: " + totalAge);

        // Check if a field is mapped
        /* read */ boolean isMapped = record.isMapped("Name");
        System.out.println("Is 'Name' mapped: " + isMapped);

        // More unrelated operations with CSVRecord
        String name = record.get("Name");
        String country = record.get("Country");
        System.out.println("Name: " + name + ", Country: " + country);
    }
}