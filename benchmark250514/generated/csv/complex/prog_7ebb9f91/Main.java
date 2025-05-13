import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with the write method
            /* write */ CSVFormat csvFormat = CSVFormat.DEFAULT.withIgnoreHeaderCase();

            // Sample CSV data
            String csvData = "Name, Age, Country\nJohn Doe, 30, USA\nJane Smith, 25, UK";

            // Parse the CSV data using the configured format
            CSVParser parser = new CSVParser(new StringReader(csvData), csvFormat);

            // Get the records from the parser
            List<CSVRecord> records = parser.getRecords();

            // Unrelated code to make the program more complex
            ArrayList<String> names = new ArrayList<>();
            for (CSVRecord record : records) {
                names.add(record.get("Name"));
            }

            // Process unrelated data
            for (String name : names) {
                System.out.println("Processing name: " + name);
            }

            // More unrelated operations
            int sumOfAges = 0;
            for (CSVRecord record : records) {
                sumOfAges += Integer.parseInt(record.get("Age"));
            }
            System.out.println("Sum of ages: " + sumOfAges);

            // Read using the read method
            /* read */ boolean isMapped = records.get(0).isMapped("Name");

            // Output the result
            System.out.println("Is 'Name' mapped: " + isMapped);

            // Close the parser
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}