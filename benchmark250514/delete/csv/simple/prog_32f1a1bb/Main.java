import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with a null string setting
        CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL");

        // Create a sample CSV record for demonstration
        String[] data = {"value1", null, "value3"};
        CSVRecord record = CSVFormat.DEFAULT.parse(Arrays.asList(data)).iterator().next();

        // Use the write method
        /* write */ format = format.withNullString("NULL");

        // Use the read method
        /* read */ boolean isSet = record.isSet(1);

        // Print the result
        System.out.println("Is the second column set? " + isSet);
    }
}