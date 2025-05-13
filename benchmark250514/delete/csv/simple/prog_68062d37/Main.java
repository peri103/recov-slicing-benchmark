import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Create a CSVFormat object
        CSVFormat format = CSVFormat.DEFAULT;
        
        // Use the write method to set the configuration
        /* write */ format = format.withAllowDuplicateHeaderNames(true);
        
        // Simulate a CSVRecord with a dummy header
        String[] headers = {"header1", "header2", "header1"}; // Duplicate header names
        String[] values = {"value1", "value2", "value3"};
        CSVRecord record = new CSVRecord(null, values, headers, null, null);
        
        // Use the read method to check if a header is set
        /* read */ boolean isSet = record.isSet("header1");
        
        // Output the result
        System.out.println("Is header 'header1' set? " + isSet);
    }
}