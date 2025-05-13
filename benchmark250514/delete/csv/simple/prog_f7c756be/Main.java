import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat object
        CSVFormat format = CSVFormat.DEFAULT;
        
        // Use the write method
        /* write */ format = format.withAllowDuplicateHeaderNames(true);

        // Create a mock CSVRecord for demonstration
        CSVRecord record = new CSVRecord(null, null, null, format);

        // Use the read method
        /* read */ boolean isMapped = record.isMapped("someHeader");
        
        // Print the result
        System.out.println(isMapped);
    }
}