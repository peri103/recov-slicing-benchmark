import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with the write method
        CSVFormat csvFormat = CSVFormat.DEFAULT;
        /* write */ csvFormat = csvFormat.withIgnoreHeaderCase();
        
        // Sample CSV data for demonstration purposes
        String csvData = "Name, Age\nJohn, 30\nDoe, 25";
        
        try {
            // Parse the CSV data
            List<CSVRecord> records = csvFormat.parse(new StringReader(csvData)).getRecords();
            
            // Use the read method on the first CSVRecord
            CSVRecord record = records.get(0);
            /* read */ boolean isMapped = record.isMapped("name");
            
            // Output the result
            System.out.println("Is 'name' mapped: " + isMapped);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}