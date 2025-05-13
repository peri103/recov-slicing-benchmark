import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSVFormat instance with a trailing delimiter
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withTrailingDelimiter();

            // Sample CSV data
            String csvData = "name,age,city\nJohn,30,New York\nJane,25,Los Angeles\n";

            // Parse the CSV data using the format with trailing delimiter
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Get the first record
            CSVRecord record = parser.getRecords().get(0);

            // Check if a specific column is set in the record
            /* read */ boolean isSet = record.isSet("name");

            // Output the result
            System.out.println("Is 'name' column set in the first record? " + isSet);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}