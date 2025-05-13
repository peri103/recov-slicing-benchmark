import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with a null string representation
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withNullString("NULL");

        // Create a CSVRecord for demonstration
        String[] data = {"value1", "NULL", "value3"};
        CSVRecord record = new CSVRecord(null, data, null, 0, format);

        // Read from the CSVRecord
        /* read */ boolean isSet = record.isSet(1); // Checks if the second element is set
        System.out.println("Is the second element set? " + isSet);
    }
}