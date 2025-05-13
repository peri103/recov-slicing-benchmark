import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with the specified configuration
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withAllowMissingColumnNames(true);

            // Sample CSV data
            String csvData = "name,age\nJohn,30\nJane,25";

            // Parse the CSV data using the format
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Get the first record
            CSVRecord record = parser.getRecords().get(0);

            // Check if a column is set
            /* read */ boolean isSet = record.isSet("name");
            System.out.println("Is 'name' column set in the first record? " + isSet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}