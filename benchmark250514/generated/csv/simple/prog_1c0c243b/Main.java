import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize the CSV format
        CSVFormat format = CSVFormat.DEFAULT;
        
        // Use the write method to set a null string representation
        /* write */ format = format.withNullString("NULL");

        // Create a CSV string to parse
        String csvData = "name,age,city\nJohn,30,NULL";

        try {
            // Parse the CSV string
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();
            
            // Access the first record
            CSVRecord record = records.get(0);
            
            // Use the read method to check if a field is set
            /* read */ boolean isSet = record.isSet("city");
            
            // Print the result
            System.out.println("Is 'city' set: " + isSet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}