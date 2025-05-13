import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with the write method
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withAllowMissingColumnNames();
            
            // Sample CSV data
            String csvData = "name,age\nJohn,30\nDoe,25";
            
            // Parse the CSV data using the format
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            
            // Get the first record
            CSVRecord record = parser.getRecords().get(0);
            
            // Use the read method
            /* read */ boolean isSet = record.isSet("name");
            
            // Output the result
            System.out.println("Is 'name' set in the first record: " + isSet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}