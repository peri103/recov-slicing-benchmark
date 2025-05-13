import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with trailing delimiter
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withTrailingDelimiter();

            // Create a sample CSV data
            String csvData = "name,age\nJohn,30\nJane,25\n";

            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);

            // Get the first record
            CSVRecord record = parser.getRecords().get(0);

            // Check if a specific column is set in the record
            /* read */ boolean isSet = record.isSet("name");

            // Output the result
            System.out.println("Is 'name' set: " + isSet);

            // Close the parser
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}