import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with allow missing column names
        CSVFormat format = CSVFormat.DEFAULT.withAllowMissingColumnNames(); /* write */

        // Create a mock CSVRecord for demonstration purposes
        CSVRecord record = new CSVRecord(format, Arrays.asList("value1", "value2"), null, 0, 0);

        // Check if a specific column index is set in the record
        boolean isColumnSet = record.isSet(0); /* read */

        // Output the result
        System.out.println("Is column set: " + isColumnSet);
    }
}