import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with the write method
        CSVFormat csvFormat = CSVFormat.DEFAULT;
        /* write */ csvFormat = csvFormat.withIgnoreHeaderCase();
        
        // Sample CSV data for demonstration purposes
        String csvData = "Name, Age\nJohn, 30\nDoe, 25";
        
        try {
            // Parse the CSV data
            List<CSVRecord> records = csvFormat.parse(new StringReader(csvData)).getRecords();
            
            // Additional complex logic: Process records and store in a map
            Map<String, Integer> nameAgeMap = new HashMap<>();
            for (CSVRecord record : records) {
                String name = record.get("Name");
                int age = Integer.parseInt(record.get("Age"));
                nameAgeMap.put(name, age);
            }
            
            // More complex logic: Process the map data
            ArrayList<String> names = new ArrayList<>(nameAgeMap.keySet());
            for (String name : names) {
                System.out.println("Processing name: " + name);
            }
            
            // Use the read method on the first CSVRecord
            CSVRecord firstRecord = records.get(0);
            /* read */ boolean isMapped = firstRecord.isMapped("name");
            
            // Output the result
            System.out.println("Is 'name' mapped: " + isMapped);
            
            // Additional processing: Calculate average age
            int totalAge = 0;
            for (Integer age : nameAgeMap.values()) {
                totalAge += age;
            }
            double averageAge = totalAge / (double) nameAgeMap.size();
            System.out.println("Average Age: " + averageAge);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}