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
        // Initialize CSVFormat with a null string
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withNullString("NULL");

        // Sample CSV data
        String csvData = "name,age,city\nJohn,NULL,New York\nJane,30,NULL";

        try {
            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Get the records
            List<CSVRecord> records = parser.getRecords();

            // Initialize a map to store processed data
            Map<String, String> processedData = new HashMap<>();

            // Process each record
            for (CSVRecord record : records) {
                String name = record.get("name");
                String age = record.get("age");
                String city = record.get("city");

                // Store processed data in map
                processedData.put(name, "Age: " + age + ", City: " + city);
            }

            // Perform some unrelated operations
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
            }
            System.out.println("Sum of numbers from 0 to 9: " + sum);

            // Access a specific record and check if a column is set
            CSVRecord record = records.get(0); // First record
            /* read */ boolean isSet = record.isSet("age");

            System.out.println("Is 'age' set in the first record? " + isSet);

            // Print processed data
            for (Map.Entry<String, String> entry : processedData.entrySet()) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}