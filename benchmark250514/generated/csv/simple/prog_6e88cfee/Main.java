import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.List;
import java.io.StringReader;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with the write method
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withIgnoreSurroundingSpaces(true);

            // Sample CSV data
            String csvData = "Name, Age\nJohn Doe, 30\nJane Smith, 25";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Get records
            List<CSVRecord> records = parser.getRecords();

            // Read from the first record using the read method
            /* read */ boolean isConsistent = records.get(0).isConsistent();
            System.out.println("Is first record consistent? " + isConsistent);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}