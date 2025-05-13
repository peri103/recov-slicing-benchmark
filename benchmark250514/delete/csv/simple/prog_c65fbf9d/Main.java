import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with default settings
        CSVFormat format = CSVFormat.DEFAULT;
        
        // Use the write method to modify the format
        /* write */ format = format.withTrim();
        
        // Create a mock CSVRecord for demonstration purposes
        CSVRecord record = new CSVRecord(null, null, null, null, format);
        
        // Use the read method to check if a record is mapped
        /* read */ boolean isMapped = record.isMapped("header");
        
        // Output the result
        System.out.println(isMapped);
    }
}