import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with the write method
            /* write */ CSVFormat csvFormat = CSVFormat.DEFAULT.withIgnoreHeaderCase();

            // Sample CSV data
            String csvData = "Name, Age, Country\nJohn Doe, 30, USA";

            // Parse the CSV data using the configured format
            CSVParser parser = new CSVParser(new StringReader(csvData), csvFormat);

            // Get the records from the parser
            List<CSVRecord> records = parser.getRecords();

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