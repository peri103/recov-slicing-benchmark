import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        // Initialize the data and CSV format
        String csvData = "Name,Age,Location\nJohn,30,USA\nDoe,25,Canada";
        CSVFormat format = CSVFormat.DEFAULT.withFirstRecordAsHeader(); // /* write */

        try {
            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            CSVRecord record = parser.getRecords().get(0); // Get the first record

            // Check if a header is mapped
            boolean isMapped = record.isMapped("Name"); // /* read */
            System.out.println("Is 'Name' header mapped: " + isMapped);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}