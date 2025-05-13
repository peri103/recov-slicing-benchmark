import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Create a CSVFormat instance using the write method
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withAllowMissingColumnNames(true);

        // Simulate a CSV record for reading
        CSVRecord record = new CSVRecord(format, new String[]{"value1", "value2"}, null, 0, 0);

        // Read using the read method
        /* read */ boolean isSet = record.isSet("value1");

        // Print the result
        System.out.println(isSet);
    }
}