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
            // Create a CSVFormat instance and apply the 'withTrim' method
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withTrim();

            // Create a sample CSV data
            String csvData = "name, age\nJohn Doe, 30\nJane Smith, 25";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Initialize a map to store CSV records
            Map<String, Integer> nameToAgeMap = new HashMap<>();

            // Iterate over the records and populate the map
            for (CSVRecord record : parser) {
                String name = record.get("name");
                int age = Integer.parseInt(record.get("age"));
                nameToAgeMap.put(name, age);
            }

            // Additional unrelated code block
            int sumOfAges = 0;
            for (Integer age : nameToAgeMap.values()) {
                sumOfAges += age;
            }
            System.out.println("Sum of ages: " + sumOfAges);

            // Get the first record
            CSVRecord firstRecord = parser.getRecords().get(0);

            // Use the 'isMapped' method on the CSVRecord
            /* read */ boolean isMapped = firstRecord.isMapped("name");

            // Output the result
            System.out.println("Is 'name' mapped in the first record? " + isMapped);

            // Output the contents of the map
            System.out.println("Name to Age Map: " + nameToAgeMap);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}