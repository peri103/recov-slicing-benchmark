import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize CSV format
        CSVFormat csvFormat = CSVFormat.DEFAULT;
        
        // Use the write method to allow missing column names
        /* write */ csvFormat = csvFormat.withAllowMissingColumnNames(true);
        
        // Sample CSV data with missing column names
        String csvData = ",value1\n,value2";
        
        try {
            // Parse the CSV data
            CSVParser csvParser = CSVParser.parse(new StringReader(csvData), csvFormat);
            List<CSVRecord> records = csvParser.getRecords();
            
            // Use the read method to check if a certain position is set
            CSVRecord record = records.get(0);
            /* read */ boolean isSet = record.isSet(0);
            
            // Print the result
            System.out.println("Is column 0 set in the first record? " + isSet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}