import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize a CSVFormat object and configure it to allow missing column names
            CSVFormat csvFormat = CSVFormat.DEFAULT;
            /* write */ csvFormat = csvFormat.withAllowMissingColumnNames(true);

            // Create a CSVParser using the configured CSVFormat
            String csvData = "1,2,3\n4,5,6\n";
            CSVParser parser = CSVParser.parse(new StringReader(csvData), csvFormat);

            // Read the first record from the CSVParser
            CSVRecord record = parser.getRecords().get(0);

            // Check if the record is consistent
            /* read */ boolean isConsistent = record.isConsistent();
            System.out.println("Is the record consistent? " + isConsistent);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}