import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with default settings
        CSVFormat format = CSVFormat.DEFAULT;
        
        // Use the write method to modify the format
        /* write */ format = format.withIgnoreSurroundingSpaces(true);
        
        // Create a mock CSVRecord to read from
        CSVRecord record = new CSVRecord(null, null, format);
        
        // Use the read method to check consistency
        /* read */ boolean isConsistent = record.isConsistent();
        
        // Output the result
        System.out.println("Is the CSVRecord consistent? " + isConsistent);
    }
}