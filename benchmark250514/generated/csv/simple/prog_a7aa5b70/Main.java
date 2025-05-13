import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with trailing delimiter
            CSVFormat format = CSVFormat.DEFAULT.withTrailingDelimiter();

            // Sample CSV data
            String csvData = "Name,Age,Location\nAlice,30,Wonderland\nBob,25,Builderland";

            // Parse the CSV data using the format
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Get the first record
            CSVRecord record = parser.getRecords().get(0);

            // Check if a column is set in the record
            /* read */ boolean isSet = record.isSet("Name");

            // Print result
            System.out.println("Is 'Name' column set: " + isSet);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}