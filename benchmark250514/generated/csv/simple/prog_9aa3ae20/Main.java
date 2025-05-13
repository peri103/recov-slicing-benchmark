import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Create a CSVFormat instance
        CSVFormat format = CSVFormat.DEFAULT;
        
        // Use the write method to modify the format
        /* write */ format = format.withIgnoreEmptyLines(true);
        
        // Create a dummy CSVRecord instance for demonstration
        CSVRecord record = null; // Assuming a record is obtained from a CSV parser

        // Use the read method on the CSVRecord instance
        if (record != null) {
            /* read */ boolean isConsistent = record.isConsistent();
            System.out.println(isConsistent);
        } else {
            System.out.println("CSVRecord is null.");
        }
    }
}