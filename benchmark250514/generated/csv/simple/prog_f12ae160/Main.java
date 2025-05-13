import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with the method to ignore header case
        CSVFormat csvFormat = CSVFormat.DEFAULT.withIgnoreHeaderCase();

        // Sample CSV data
        String csvData = "Name,Age\nJohn,30\nJane,25";

        try {
            // Parse the CSV data using the CSVFormat
            CSVParser parser = CSVParser.parse(new StringReader(csvData), csvFormat);

            // Assume we are interested in the first record
            CSVRecord record = parser.getRecords().get(0);

            // Check if the record is mapped (i.e., has a mapping for the headers)
            /* read */ boolean isMapped = record.isMapped("name");

            // Print the result
            System.out.println("Is 'name' mapped in the record? " + isMapped);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}