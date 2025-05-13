import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with a null string
        CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL");
        
        // Create a CSVRecord using the format
        CSVRecord record = format.parse(Arrays.asList("value1", "NULL", "value3")).get(0);
        
        // Check if the second value is set (it should be null)
        /* read */ boolean isSet = record.isSet(1);
        
        // Print the result
        System.out.println(isSet);  // Expected to print false since "NULL" is considered as null
    }
}