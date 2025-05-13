import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with specific configuration
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces();

            // Sample CSV data
            String csvData = "name, age\nJohn, 30\nJane, 25";

            // Parse the CSV data using the configured format
            CSVParser parser = CSVParser.parse(csvData, format);
            List<CSVRecord> records = parser.getRecords();

            // Read the data using CSVRecord's method
            /* read */ boolean isSet = records.get(0).isSet("name");
            System.out.println("Is 'name' set in the first record? " + isSet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}