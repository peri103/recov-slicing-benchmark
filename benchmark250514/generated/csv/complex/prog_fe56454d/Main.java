import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with the write method
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces(true);

            // Sample CSV data
            String csvData = "Name, Age, Location\nJohn Doe, 29, New York\nJane Smith, 34, Los Angeles";

            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);

            // Get the records from the parser
            List<CSVRecord> records = parser.getRecords();

            // Process each record and store in a map
            Map<String, Integer> ageMap = new HashMap<>();
            for (CSVRecord record : records) {
                String name = record.get("Name");
                int age = Integer.parseInt(record.get("Age"));
                ageMap.put(name, age);
            }

            // Perform some operations on the map
            for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
                System.out.println("Name: " + entry.getKey() + ", Age: " + entry.getValue());
            }

            // Access the first record
            CSVRecord firstRecord = records.get(0);

            // Use the read method to check if a column is set
            /* read */ boolean isSet = firstRecord.isSet("Name");

            // Output the result
            System.out.println("Is 'Name' column set in the first record? " + isSet);

            // Close the parser
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}