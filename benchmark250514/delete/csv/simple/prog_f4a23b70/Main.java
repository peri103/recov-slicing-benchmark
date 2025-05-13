import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with default settings
        CSVFormat format = CSVFormat.DEFAULT;
        
        // Use the write method to modify the CSVFormat object
        /* write */ format = format.withIgnoreSurroundingSpaces(true);
        
        // Simulate a CSVRecord that would be consistent with the format settings
        CSVRecord record = new CSVRecord(null, null, null, null, null, null, format);
        
        // Use the read method to check consistency
        /* read */ boolean isConsistent = record.isConsistent();
        
        // Output the result
        System.out.println("Is the record consistent? " + isConsistent);
    }
}