import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with the write method
        CSVFormat format = CSVFormat.DEFAULT.withAllowMissingColumnNames();
        
        // Sample CSV data
        String csvData = "name,age\nJohn,25\nDoe,30";
        
        try {
            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();
            
            // Access a record from the parsed data
            CSVRecord record = records.get(0);
            
            // Use the read method to check if a certain column is set
            /* read */ boolean isSet = record.isSet("name");
            
            // Print the result
            System.out.println("Is 'name' column set in the first record? " + isSet);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}