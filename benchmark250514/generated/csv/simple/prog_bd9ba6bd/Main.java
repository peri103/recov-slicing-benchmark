import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with the write method
            CSVFormat format = CSVFormat.DEFAULT.withIgnoreEmptyLines(true); /* write */

            // Sample CSV data
            String csvData = "name,age\nJohn,30\n\nDoe,25";

            // Parse the CSV data using the initialized format
            CSVParser parser = new CSVParser(new StringReader(csvData), format);

            // Read the first record
            CSVRecord record = parser.getRecords().get(0);

            // Use the read method to check if a field is set
            boolean isSet = record.isSet("name"); /* read */

            // Output the result
            System.out.println("Is 'name' field set in the first record? " + isSet);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}