import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with the write method
            /* write */ CSVFormat csvFormat = CSVFormat.DEFAULT.withIgnoreEmptyLines(true);

            // Sample CSV data
            String csvData = "name,age,city\nJohn,30,New York\nJane,25,Los Angeles";

            // Parse the CSV data using the configured CSVFormat
            CSVParser parser = CSVParser.parse(new StringReader(csvData), csvFormat);

            // Get the first record
            CSVRecord record = parser.getRecords().get(0);

            // Check if the 'name' field is set using the read method
            /* read */ boolean isSet = record.isSet("name");

            // Output the result
            System.out.println("Is 'name' field set? " + isSet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}