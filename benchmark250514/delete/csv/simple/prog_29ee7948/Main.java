import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat instance
        CSVFormat csvFormat = CSVFormat.DEFAULT;
        
        // Use the write method
        /* write */ csvFormat = csvFormat.withIgnoreHeaderCase(true);
        
        // Create a CSVRecord instance for demonstration purposes
        // Normally, CSVRecord instances are obtained from parsing CSV data
        String[] recordData = {"header1", "value1"};
        CSVRecord csvRecord = new CSVRecord(null, recordData, null, 0, 0);
        
        // Use the read method
        /* read */ boolean isMapped = csvRecord.isMapped("header1");
        
        // Output the result
        System.out.println("Is 'header1' mapped: " + isMapped);
    }
}