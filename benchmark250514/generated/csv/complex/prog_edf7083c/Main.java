import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.QuoteMode;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Sample CSV data
        String csvData = "Name, Age, City\nJohn Doe, 29, New York";

        try {
            // Initialize CSVFormat and configure it
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withIgnoreSurroundingSpaces(true);

            // Additional configuration for CSVFormat
            format = format.withQuoteMode(QuoteMode.ALL);
            format = format.withHeader("Name", "Age", "City");

            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);

            // Process all records
            List<CSVRecord> records = parser.getRecords();
            List<String> cities = new ArrayList<>();

            for (CSVRecord record : records) {
                // Add city to the list
                cities.add(record.get("City"));
            }

            // Get the first record
            CSVRecord firstRecord = records.get(0);

            // Perform unrelated operations
            int sumOfAges = 0;
            for (CSVRecord record : records) {
                sumOfAges += Integer.parseInt(record.get("Age"));
            }
            System.out.println("Sum of ages: " + sumOfAges);

            // Check if a column is set
            /* read */ boolean isNameSet = firstRecord.isSet("Name");

            // Output the result
            System.out.println("Is 'Name' set in the record? " + isNameSet);

            // Print cities
            System.out.println("Cities: " + cities);

            // Close the parser
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}