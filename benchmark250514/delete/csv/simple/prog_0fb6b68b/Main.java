import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Create a CSVFormat instance and configure it to allow missing column names.
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withAllowMissingColumnNames(true);

        // Simulate a CSVRecord for demonstration purposes
        CSVRecord record = new CSVRecord(null, new String[]{"value1", "value2"}, null, 0, 0);

        // Check if a particular column is set
        /* read */ boolean isSet = record.isSet("value1");
        System.out.println(isSet);
    }
}