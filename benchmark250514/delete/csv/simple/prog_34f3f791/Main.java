import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with a null string
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withNullString("NULL");

        // Create a CSVRecord for demonstration
        String[] values = {"value1", "NULL", "value3"};
        CSVRecord record = new CSVRecord(format.parse(Arrays.asList(values)).iterator().next(), null, 0, values);

        // Check if a specific index is set in the CSVRecord
        /* read */ boolean isSet = record.isSet(1);
        System.out.println(isSet);
    }
}