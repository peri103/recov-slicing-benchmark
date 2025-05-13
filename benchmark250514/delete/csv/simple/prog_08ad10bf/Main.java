import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a CSVFormat instance
        CSVFormat format = CSVFormat.DEFAULT;

        // Use the write method to set a null string representation
        /* write */ format = format.withNullString("NULL");

        // Create a mock CSVRecord for demonstration
        List<String> recordData = Arrays.asList("data1", "NULL", "data3");
        CSVRecord record = new CSVRecord(null, recordData, null, 0, 0);

        // Use the read method to check if a specific index is set
        /* read */ boolean isSet = record.isSet(1);
        System.out.println("Is the second element set? " + isSet);
    }
}