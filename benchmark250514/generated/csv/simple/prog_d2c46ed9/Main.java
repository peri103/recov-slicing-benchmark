import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        try {
            // Prepare CSV data
            String csvData = "Name, Age, City\nAlice, 30, New York\nBob, 25, Los Angeles";
            
            // Configure CSVFormat with write method
            CSVFormat format = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces();
            
            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();
            
            // Use read method on the first record
            CSVRecord record = records.get(0);
            /* read */ boolean isSet = record.isSet("Name");
            
            // Output the result
            System.out.println("Is 'Name' set in the first record? " + isSet);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}