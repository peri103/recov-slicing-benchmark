import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize the CSVFormat object
        CSVFormat csvFormat = CSVFormat.DEFAULT;
        
        // Use the write method to set the delimiter
        /* write */ csvFormat = csvFormat.withDelimiter(';');
        
        // Create a dummy CSVRecord for demonstration (normally obtained from parsing a CSV file)
        CSVRecord csvRecord = new CSVRecord(null, new String[]{"value1", "value2"}, 0, 0);
        
        // Use the read method to read the CSVRecord
        /* read */ String recordString = csvRecord.toString();
        
        // Output the result
        System.out.println(recordString);
    }
}