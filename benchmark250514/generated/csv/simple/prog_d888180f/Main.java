import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with the write method
            CSVFormat format = CSVFormat.DEFAULT.withAllowMissingColumnNames(true); /* write */

            // Sample CSV data
            String csvData = "name,age\nJohn,30\nJane,25";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Get the first record
            CSVRecord record = parser.getRecords().get(0);

            // Use the read method to check if a column is set
            boolean isSet = record.isSet("name"); /* read */

            System.out.println("Is 'name' column set in the first record? " + isSet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}