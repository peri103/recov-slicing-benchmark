import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import org.apache.commons.csv.CSVParser;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a trailing delimiter
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withTrailingDelimiter();

            // Example CSV data
            String csvData = "Name, Age, Location\nJohn Doe, 30, USA\nJane Smith, 25, UK";

            // Parse CSV data using the format
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Get all records
            List<CSVRecord> records = parser.getRecords();

            // Complex data structure to store processed data
            HashMap<String, List<String>> dataMap = new HashMap<>();

            for (CSVRecord record : records) {
                // Process each record and store in the map
                String name = record.get("Name");
                List<String> details = new ArrayList<>();
                details.add(record.get("Age"));
                details.add(record.get("Location"));
                dataMap.put(name, details);
            }

            // Additional processing
            for (String key : dataMap.keySet()) {
                System.out.println("Details for " + key + ": " + dataMap.get(key));
            }

            // Get the first record again for the read operation
            CSVRecord firstRecord = records.get(0);

            // Check if a field is set
            /* read */ boolean isSet = firstRecord.isSet("Name");

            // Output the result
            System.out.println("Is 'Name' field set in the first record? " + isSet);

            // Further unrelated complex operations
            int sumOfAges = 0;
            for (CSVRecord record : records) {
                sumOfAges += Integer.parseInt(record.get("Age"));
            }
            System.out.println("Sum of ages: " + sumOfAges);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}