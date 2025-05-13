import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with a specific null string
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withNullString("NULL");

        // Create a mock CSVRecord for demonstration purposes
        String[] data = {"value1", "NULL", "value3"};
        CSVRecord record = CSVFormat.DEFAULT.parse(java.util.Arrays.asList(data)).iterator().next();

        // Check if a specific index is set in the CSVRecord
        /* read */ boolean isSet = record.isSet(1);
        System.out.println(isSet);
    }
}