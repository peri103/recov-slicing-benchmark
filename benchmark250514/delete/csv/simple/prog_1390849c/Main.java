import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat object
        CSVFormat format = CSVFormat.DEFAULT;
        
        // Use the write method to configure the format
        /* write */ format = format.withIgnoreEmptyLines(true);
        
        // Simulate a CSVRecord instance for demonstration purposes
        CSVRecord record = new CSVRecord(null, null, format, 0, null);
        
        // Use the read method to check if a certain field is set
        /* read */ boolean isSet = record.isSet(0);
        
        // Output the result
        System.out.println("Is field set: " + isSet);
    }
}