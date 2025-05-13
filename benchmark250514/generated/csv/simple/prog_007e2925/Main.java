import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSV format with the write operation
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces(true);

            // Sample CSV data
            String csvData = "name, age\nJohn Doe, 30\nJane Doe, 25";

            // Parse the CSV data using the format
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();

            // Read operation on the first record
            /* read */ boolean isSet = records.get(0).isSet("name");
            
            // Print the result of the read operation
            System.out.println("Is 'name' set in the first record? " + isSet);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}