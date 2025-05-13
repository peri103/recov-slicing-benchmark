import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Initialize the CSVFormat object
        CSVFormat format = CSVFormat.DEFAULT;
        
        // Write operation: configure the format to ignore empty lines
        /* write */ format = format.withIgnoreEmptyLines(true);

        // Create a CSVRecord object for demonstration
        String[] data = {"value1", "value2"};
        CSVRecord record = CSVFormat.DEFAULT.parse(Arrays.asList(data)).iterator().next();
        
        // Read operation: check if a certain column is set
        /* read */ boolean isSet = record.isSet(0);
        
        // Output the result
        System.out.println("Is column 0 set: " + isSet);
    }
}