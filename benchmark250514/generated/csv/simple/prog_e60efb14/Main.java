import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with a trailing delimiter
        CSVFormat format = CSVFormat.DEFAULT.withTrailingDelimiter(); /* write */

        // Sample CSV input
        String csvData = "name,age,city\nJohn,30,New York\nJane,25,Los Angeles";

        try {
            // Parse the CSV data
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();

            // Read from the first CSV record
            CSVRecord record = records.get(0);
            boolean isSet = record.isSet("age"); /* read */

            // Output the result
            System.out.println("Is 'age' set in the first record? " + isSet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}