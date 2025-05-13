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

            // Sample CSV input
            String csvData = "name,age,city\nJohn,30,New York\nAlice,25,Los Angeles";

            // Parse the CSV data using the format with trailing delimiter
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Read the first record
            CSVRecord record = parser.getRecords().get(0);

            // Check if a specific column is set
            /* read */ boolean isSet = record.isSet("name");

            // Output the result
            System.out.println("Is 'name' column set? " + isSet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}