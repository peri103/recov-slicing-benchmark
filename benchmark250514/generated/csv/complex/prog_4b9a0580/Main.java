import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Define a sample CSV input
        String csvData = "name, age\nJohn Doe, 30\nJane Smith, 25";
        
        try {
            // Create a CSVFormat object with trimming enabled
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withTrim();

            // Parse the CSV data using the format
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Retrieve all records
            List<CSVRecord> records = parser.getRecords();

            // Create a map to store names and ages
            Map<String, Integer> nameAgeMap = new HashMap<>();

            // Populate the map with data from CSV records
            for (CSVRecord record : records) {
                String name = record.get("name");
                int age = Integer.parseInt(record.get("age"));
                nameAgeMap.put(name, age);
            }

            // Perform some operations on the map
            for (Map.Entry<String, Integer> entry : nameAgeMap.entrySet()) {
                System.out.println(entry.getKey() + " is " + entry.getValue() + " years old.");
            }

            // Retrieve the first record again
            CSVRecord firstRecord = records.get(0);

            // Check if the record is mapped (it should be since we have headers)
            /* read */ boolean isMapped = firstRecord.isMapped("name");

            // Print the result
            System.out.println("Is 'name' mapped: " + isMapped);

            // Additional logic to add complexity
            List<String> names = new ArrayList<>(nameAgeMap.keySet());
            for (String name : names) {
                System.out.println("Processing name: " + name);
            }

            // More complex operations
            int totalAge = 0;
            for (int age : nameAgeMap.values()) {
                totalAge += age;
            }
            double averageAge = totalAge / (double) nameAgeMap.size();
            System.out.println("Average age: " + averageAge);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}