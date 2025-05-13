import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a trailing delimiter
            CSVFormat format = CSVFormat.DEFAULT /* write */.withTrailingDelimiter();

            // Sample CSV data
            String csvData = "name,age,location\nAlice,30,New York\nBob,25,Los Angeles\n";

            // Parse the CSV data using the format with a trailing delimiter
            CSVParser parser = new CSVParser(new StringReader(csvData), format);

            // Get the list of records
            List<CSVRecord> records = parser.getRecords();

            // Check if a specific field is set in the first record
            boolean isSet = records.get(0) /* read */.isSet("location");

            System.out.println("Is 'location' set in the first record? " + isSet);

            // Close the parser
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}