import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        // Sample CSV data
        String csvData = "name,age\nJohn,30\nDoe,25";

        try {
            // Create a CSVFormat object and configure it to use the first record as header
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withFirstRecordAsHeader();

            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);

            // Get the first record
            CSVRecord record = parser.getRecords().get(0);

            // Check if a header is mapped
            /* read */ boolean isMapped = record.isMapped("name");

            // Print the result
            System.out.println("Is 'name' header mapped: " + isMapped);

            // Close the parser
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}