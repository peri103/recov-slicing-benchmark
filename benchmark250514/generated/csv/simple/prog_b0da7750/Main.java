import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with a trailing delimiter
        CSVFormat format = CSVFormat.DEFAULT /* write */ .withTrailingDelimiter();

        // Prepare a sample CSV data
        String csvData = "name,age,city\nJohn,30,New York\nDoe,25,Los Angeles";

        try {
            // Parse the CSV data using the format
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Retrieve records
            List<CSVRecord> records = parser.getRecords();

            // Access the first record
            CSVRecord record = records.get(0);

            // Check if a specific column is set
            boolean isSet = /* read */ record.isSet("name");

            // Output the result
            System.out.println("Is 'name' column set in the first record? " + isSet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}