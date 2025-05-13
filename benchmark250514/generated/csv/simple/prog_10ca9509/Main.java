import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a null string representation
            CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL");

            // Create a sample CSV input
            String csvData = "name,age\nJohn,NULL\nDoe,25";
            
            // Parse the CSV data using the format
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Retrieve records
            List<CSVRecord> records = parser.getRecords();

            // Access a specific record
            CSVRecord record = records.get(0); // First record: "John,NULL"

            // Check if the 'age' column is set (should be false for NULL)
            /* read */ boolean isAgeSet = record.isSet("age");

            // Print the result
            System.out.println("Is 'age' set for the first record: " + isAgeSet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}