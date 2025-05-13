import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with header
        CSVFormat format = CSVFormat.DEFAULT.withFirstRecordAsHeader(); // /* write */

        // Sample CSV data
        String csvData = "Name, Age\nJohn, 30\nJane, 25";

        try {
            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Get the first record
            CSVRecord record = parser.getRecords().get(0);

            // Check if a header is mapped
            boolean isMapped = record.isMapped("Name"); // /* read */

            // Output the result
            System.out.println("Is 'Name' header mapped? " + isMapped);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}