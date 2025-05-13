import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat instance
        CSVFormat format = CSVFormat.DEFAULT;
        
        // Use the write method to modify the format
        /* write */ format = format.withIgnoreEmptyLines(true);
        
        // Create a mock CSVRecord for demonstration purposes
        CSVRecord record = new CSVRecord(null, new String[]{"value"}, null, 0, 0);
        
        // Use the read method to check if a particular field is set
        /* read */ boolean isSet = record.isSet(0);
        
        // Output the result
        System.out.println("Is field set: " + isSet);
    }
}