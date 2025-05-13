import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with a null string setting
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withNullString("NULL");

        // Create a sample CSVRecord for demonstration
        String[] values = {"value1", "NULL", "value3"};
        CSVRecord record = CSVFormat.DEFAULT.parse(values).get(0);

        // Check if a specific index is set in the CSVRecord
        /* read */ boolean isSet = record.isSet(1);
        
        // Output the result
        System.out.println("Is index 1 set: " + isSet);
    }
}