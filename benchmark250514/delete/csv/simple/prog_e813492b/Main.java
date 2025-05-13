import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a CSVFormat object
        CSVFormat format = CSVFormat.DEFAULT;

        // Use the write method
        /* write */ format = format.withNullString("NULL");

        // Create a sample CSVRecord object
        List<String> values = Arrays.asList("value1", "value2", "value3");
        CSVRecord record = new CSVRecord(values, null, -1, -1);

        // Use the read method
        /* read */ boolean isMapped = record.isMapped("value1");

        // Print the result
        System.out.println(isMapped);
    }
}