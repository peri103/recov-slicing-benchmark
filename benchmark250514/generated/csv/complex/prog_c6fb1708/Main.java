import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with the write method
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withFirstRecordAsHeader();

            // Sample CSV data
            String csvData = "Name, Age\nJohn Doe, 30\nJane Smith, 25";

            // Parse the CSV data using the format
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Create a map to store records
            Map<String, Integer> nameToAgeMap = new HashMap<>();

            // Process each record
            for (CSVRecord record : parser) {
                String name = record.get("Name");
                int age = Integer.parseInt(record.get("Age"));
                nameToAgeMap.put(name, age);
            }

            // Perform some operations on the map
            for (Map.Entry<String, Integer> entry : nameToAgeMap.entrySet()) {
                System.out.println(entry.getKey() + " is " + entry.getValue() + " years old.");
            }

            // Get the first record
            CSVRecord record = parser.getRecords().get(0);

            // Perform additional operations
            int totalAge = nameToAgeMap.values().stream().mapToInt(Integer::intValue).sum();
            System.out.println("Total age: " + totalAge);

            // Use the read method to check if a header is mapped
            /* read */ boolean isMapped = record.isMapped("Name");

            // Output the result
            System.out.println("Is 'Name' mapped? " + isMapped);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}