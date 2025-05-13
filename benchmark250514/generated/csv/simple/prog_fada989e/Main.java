import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Define CSV format with allowing missing column names
            /* write */
            CSVFormat format = CSVFormat.DEFAULT.withAllowMissingColumnNames(true);
            
            // Sample CSV data
            String csvData = "name,age\nJohn,30\nDoe,25";
            
            // Parse the CSV data using the defined format
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            
            // Get the first record
            CSVRecord record = parser.getRecords().get(0);
            
            // Check if a specific column is set (e.g., "age")
            /* read */
            boolean isAgeSet = record.isSet("age");
            
            // Output the result
            System.out.println("Is 'age' column set in the first record? " + isAgeSet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}