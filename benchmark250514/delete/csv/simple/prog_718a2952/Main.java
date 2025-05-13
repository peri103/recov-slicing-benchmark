import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with a configuration
        CSVFormat format = CSVFormat.DEFAULT;
        
        // Use the write method to configure the format
        /* write */ format = format.withIgnoreHeaderCase(true);
        
        // Create a CSVRecord for demonstration purposes
        // In a real scenario, CSVRecord would be obtained from parsing a CSV file
        String[] values = {"Header1", "Header2"};
        CSVRecord record = new CSVRecord(null, values, null, 0, format);
        
        // Use the read method to check if a header is mapped
        /* read */ boolean isMapped = record.isMapped("header1");
        
        // Output the result of the read operation
        System.out.println("Is 'header1' mapped: " + isMapped);
    }
}