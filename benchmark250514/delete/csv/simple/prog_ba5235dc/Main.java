import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Create a CSVFormat object
        CSVFormat csvFormat = CSVFormat.DEFAULT;
        
        // Use the write method
        /* write */ csvFormat = csvFormat.withAllowDuplicateHeaderNames(true);
        
        // Since CSVRecord is usually obtained by parsing a CSV file, we need to simulate a record.
        // Let's create a dummy CSVRecord for demonstration purposes.
        String[] headers = {"header1", "header2"};
        String[] values = {"value1", "value2"};
        CSVRecord csvRecord = new CSVRecord(null, values, headers, null, 0, 0);
        
        // Use the read method
        /* read */ boolean isMapped = csvRecord.isMapped("header1");
        
        // Print the result
        System.out.println(isMapped);
    }
}