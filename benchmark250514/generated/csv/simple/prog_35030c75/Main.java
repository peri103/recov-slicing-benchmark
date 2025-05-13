import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with trailing delimiter
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withTrailingDelimiter();

            // Create a sample CSV data
            String csvData = "name,age\nJohn,30\nDoe,25\n";

            // Parse the CSV data using the format
            CSVParser parser = new CSVParser(new StringReader(csvData), format);

            // Read the first record
            CSVRecord record = parser.getRecords().get(0);

            // Check if a column is set in the record
            /* read */ boolean isSet = record.isSet("name");

            // Print the result
            System.out.println("Is 'name' set in the record? " + isSet);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}