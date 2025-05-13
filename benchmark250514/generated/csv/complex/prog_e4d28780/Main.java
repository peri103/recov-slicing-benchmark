import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.util.List;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with trimming
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withTrim();

            // Sample CSV data
            String csvData = "name, age, city\nJohn Doe, 30, New York\nJane Smith, 25, Los Angeles";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(csvData, format);

            // Initialize a map to store CSV records
            Map<String, CSVRecord> recordMap = new HashMap<>();

            // Process each record and store it in the map
            for (CSVRecord rec : parser) {
                String name = rec.get("name");
                recordMap.put(name, rec);
            }

            // Perform some operations on the map
            for (String key : recordMap.keySet()) {
                CSVRecord rec = recordMap.get(key);
                System.out.println("Processing record for: " + key);
                System.out.println("Age: " + rec.get("age"));
                System.out.println("City: " + rec.get("city"));
            }

            // Get the first record
            List<CSVRecord> records = parser.getRecords();
            CSVRecord record = records.get(0);

            // Check if a mapping exists for a specific column
            /* read */ boolean isMapped = record.isMapped("name");
            System.out.println("Is 'name' mapped: " + isMapped);

            // Further processing using the map
            for (String key : recordMap.keySet()) {
                CSVRecord rec = recordMap.get(key);
                System.out.println("Re-checking record for: " + key);
                System.out.println("Mapped: " + rec.isMapped("city"));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}