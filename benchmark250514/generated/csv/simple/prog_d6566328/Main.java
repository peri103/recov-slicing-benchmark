import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        // Initialize CSVFormat with a null string setting
        CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL");
        
        // Create a sample CSV input
        String csvData = "name,age\nJohn,NULL\nDoe,30";
        
        // Parse the CSV data
        CSVParser parser = new CSVParser(new StringReader(csvData), format);
        
        // Get the records
        List<CSVRecord> records = parser.getRecords();
        
        // Access the first record
        CSVRecord record = records.get(0);
        
        // Check if a particular field is set
        /* read */ boolean isSet = record.isSet("age");
        
        // Output the result
        System.out.println("Is 'age' field set in the first record? " + isSet);
        
        parser.close();
    }
}