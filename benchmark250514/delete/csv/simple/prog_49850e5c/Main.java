import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize a CSVFormat object
        CSVFormat csvFormat = CSVFormat.DEFAULT;
        
        // Use the write method to modify the CSVFormat object
        /* write */ csvFormat = csvFormat.withAllowDuplicateHeaderNames(true);
        
        // Create a CSVRecord object
        CSVRecord csvRecord = new CSVRecord(null, null, csvFormat);
        
        // Use the read method to check if a header is mapped
        /* read */ boolean isMapped = csvRecord.isMapped("header");
        
        // Print the result
        System.out.println(isMapped);
    }
}