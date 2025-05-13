import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        try {
            // Prepare CSV data
            String csvData = "Name,Age,Location\nJohn,30,New York\n\nJane,25,Los Angeles";

            // Initialize CSVFormat
            CSVFormat format = CSVFormat.DEFAULT.withIgnoreEmptyLines(true); // /* write */

            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);

            // Read the first record
            CSVRecord record = parser.getRecords().get(0);

            // Check if a specific column is set
            boolean isSet = record.isSet("Name"); // /* read */

            System.out.println("Is 'Name' column set in the first record? " + isSet);

            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}