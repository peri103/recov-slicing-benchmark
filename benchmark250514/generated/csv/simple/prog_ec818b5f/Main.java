import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        try {
            // Prepare CSV data
            String csvData = "Name, Age, Location\nJohn Doe, 30, New York";

            // Create a CSVFormat object with the specified configuration
            CSVFormat csvFormat = CSVFormat.DEFAULT;
            /* write */ csvFormat = csvFormat.withIgnoreSurroundingSpaces();

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), csvFormat);
            CSVRecord record = parser.getRecords().get(0);

            // Check if a field is set
            /* read */ boolean isSet = record.isSet("Name");
            System.out.println(isSet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}