import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with a trailing delimiter
        /* write */
        CSVFormat format = CSVFormat.DEFAULT.withTrailingDelimiter();

        // Create a sample CSVRecord using the format
        List<String> data = Arrays.asList("value1", "value2", "value3");
        CSVRecord record = new CSVRecord(data, null, format);

        // Read a value from the CSVRecord
        /* read */
        boolean isSet = record.isSet(1);
        System.out.println(isSet);
    }
}