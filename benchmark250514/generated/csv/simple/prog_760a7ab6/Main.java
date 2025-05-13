import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSV format with a header
            CSVFormat format = CSVFormat.DEFAULT.withHeader("Name", "Age", "City");
            
            // Sample CSV data
            String csvData = "Name,Age,City\nJohn,30,New York\nJane,25,Los Angeles";
            
            // Parse the CSV data using the format
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            
            // Get the records
            List<CSVRecord> records = parser.getRecords();
            
            // Retrieve the first record
            CSVRecord record = records.get(0);
            
            // Check if a header is set (e.g., "Name")
            /* read */ boolean isSet = record.isSet("Name");
            
            // Output the result
            System.out.println("Header 'Name' is set: " + isSet);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}