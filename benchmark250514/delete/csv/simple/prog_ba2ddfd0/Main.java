import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with default format
        CSVFormat format = CSVFormat.DEFAULT;
        
        // Use the write method to modify the format
        /* write */ format = format.withIgnoreSurroundingSpaces(true);
        
        // Create a dummy CSVRecord for demonstration purposes
        String[] values = {"value1", "value2", "value3"};
        CSVRecord record = CSVRecord.parse(values, format);
        
        // Use the read method to check if a value is set
        /* read */ boolean isSet = record.isSet(0);
        
        // Print the result
        System.out.println("Is value set at index 0: " + isSet);
    }
}