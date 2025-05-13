import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Define CSV content
            String csvContent = "Name,Age,Location\nJohn,30,USA\n\nJane,25,UK";

            // Create CSVFormat instance with ignoring empty lines
            CSVFormat csvFormat = CSVFormat.DEFAULT
                /* write */ .withIgnoreEmptyLines(true);

            // Parse the CSV content
            CSVParser parser = CSVParser.parse(new StringReader(csvContent), csvFormat);

            // Get the records
            List<CSVRecord> records = parser.getRecords();

            // Read the first record
            CSVRecord record = records.get(0);

            // Check if a particular column is set
            /* read */ boolean isSet = record.isSet("Name");

            // Output the result
            System.out.println("Is 'Name' set in the first record? " + isSet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}