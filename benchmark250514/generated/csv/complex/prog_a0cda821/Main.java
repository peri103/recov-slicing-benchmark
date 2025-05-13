import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSVFormat instance with trim
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withTrim();

            // Sample CSV data
            String csvData = "Name, Age, Country\nJohn Doe, 30, USA\nJane Smith, 25, UK";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Create a HashMap to store records by name
            HashMap<String, CSVRecord> recordMap = new HashMap<>();

            // Iterate over records and store them in the map
            for (CSVRecord record : parser) {
                String name = record.get("Name");
                recordMap.put(name, record);
            }

            // Perform some operations on the records
            for (String name : recordMap.keySet()) {
                CSVRecord record = recordMap.get(name);
                String country = record.get("Country");
                System.out.println(name + " is from " + country);
            }

            // Get the first record
            CSVRecord firstRecord = parser.getRecords().get(0);

            // Perform some unrelated operations
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
            }
            System.out.println("Sum of numbers from 0 to 9: " + sum);

            // Check if a column is mapped
            /* read */ boolean isMapped = firstRecord.isMapped("Name");

            // Print the result
            System.out.println("Is 'Name' column mapped: " + isMapped);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}