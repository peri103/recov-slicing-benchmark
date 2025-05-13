import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSV format with trimming enabled
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withTrim();

            // Sample CSV data
            String csvData = "Name, Age, City\nJohn Doe, 29, New York\nJane Smith, 34, Los Angeles";

            // Parse the CSV data using the format
            CSVParser parser = new CSVParser(new StringReader(csvData), format);

            // Initialize a map to store CSV records
            Map<String, CSVRecord> recordMap = new HashMap<>();

            // Iterate over each record and store them in the map
            for (CSVRecord record : parser) {
                recordMap.put(record.get("Name"), record);
            }

            // Perform some unrelated operations
            int sumOfAges = 0;
            for (CSVRecord record : recordMap.values()) {
                sumOfAges += Integer.parseInt(record.get("Age"));
            }
            System.out.println("Sum of ages: " + sumOfAges);

            // Get a specific record from the map
            CSVRecord johnRecord = recordMap.get("John Doe");

            // Perform more operations on the records
            if (johnRecord != null) {
                String city = johnRecord.get("City");
                System.out.println("John Doe lives in " + city);
            }

            // Check if a column is mapped in the record
            /* read */ boolean isMapped = johnRecord.isMapped("Name");
            System.out.println("Is 'Name' column mapped? " + isMapped);

            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}