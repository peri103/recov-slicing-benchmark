import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with the write method
        CSVFormat csvFormat = CSVFormat.DEFAULT.withIgnoreHeaderCase(true);
        
        // Create a mock CSVRecord to demonstrate the read method
        CSVRecord csvRecord = new CSVRecord(null, null, csvFormat);
        
        // Use the read method
        /* read */ boolean isMapped = csvRecord.isMapped();
        
        // Output the result
        System.out.println("Is Mapped: " + isMapped);
    }
}