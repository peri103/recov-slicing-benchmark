import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with the write method
        CSVFormat format = CSVFormat.DEFAULT.withAllowMissingColumnNames(true); /* write */

        // Create a CSVRecord for demonstration
        // Normally, CSVRecord is created by parsing a CSV file with CSVParser
        // Here, we are creating a mock CSVRecord for demonstration purposes
        CSVRecord record = new CSVRecord(format, Arrays.asList("value1", "value2"), null, 0, 0);

        // Use the read method
        boolean isSet = record.isSet("value1"); /* read */

        // Output the result
        System.out.println(isSet);
    }
}