import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with a specific configuration
        CSVFormat format = CSVFormat.DEFAULT;
        
        // Use the write method to modify the format
        /* write */ format = format.withAllowMissingColumnNames(true);
        
        // Create a dummy CSVRecord for demonstration
        String[] recordData = {"value1", "value2"};
        CSVRecord record = new CSVRecord(Arrays.asList(recordData), null, null, 0, 0);
        
        // Use the read method to check if a column is set
        /* read */ boolean isSet = record.isSet(1);
        
        // Output the result
        System.out.println(isSet);
    }
}