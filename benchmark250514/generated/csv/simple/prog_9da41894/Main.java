import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with the write method
            CSVFormat format = CSVFormat.DEFAULT /* write */.withIgnoreSurroundingSpaces();

            // Create a sample CSV content
            String csvContent = "Name, Age, Country\nJohn Doe, 30, USA";

            // Parse the CSV content using the format
            CSVParser parser = new CSVParser(new StringReader(csvContent), format);

            // Get records from the parser
            List<CSVRecord> records = parser.getRecords();

            // Read from the first record
            CSVRecord record = records.get(0);
            /* read */ boolean isSet = record.isSet("Name");

            // Output the result
            System.out.println("Is 'Name' set: " + isSet);

            // Close the parser
            parser.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}