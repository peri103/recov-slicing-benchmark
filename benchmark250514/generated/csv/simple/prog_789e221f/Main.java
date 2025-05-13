import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Prepare CSV data
            String csvData = "name,age\nJohn,30\nDoe,\n";
            
            // Create CSVFormat with a specific null string
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL");
            
            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();
            
            // Read from the record
            CSVRecord record = records.get(1); // Access the second record (Doe,)
            boolean isSet = /* read */ record.isSet("age"); // Check if 'age' column is set
            
            System.out.println("Is 'age' set for Doe: " + isSet);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}