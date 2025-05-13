import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with a null string representation
        CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL");

        // Create a CSVRecord for demonstration purposes
        CSVRecord record = new CSVRecord(null, Arrays.asList("value1", null, "value3"), format, 0, 0);

        // Use write method to set the null string representation
        /* write */ format = format.withNullString("NULL");

        // Use read method to check if a value is set at index 1 (which should be null)
        /* read */ boolean isSet = record.isSet(1);

        // Output the result
        System.out.println("Is the value at index 1 set? " + isSet);
    }
}