import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Create a CSV format with the specified setting
        CSVFormat csvFormat = CSVFormat.DEFAULT;
        /* write */ csvFormat = csvFormat.withAllowMissingColumnNames(true);

        // Create a sample CSVRecord to test the read method
        List<String> values = Arrays.asList("value1", "value2", "value3");
        CSVRecord record = new CSVRecord(values, null, csvFormat);

        // Read using the isSet method
        /* read */ boolean isSet = record.isSet(0);

        // Output the result
        System.out.println(isSet);
    }
}