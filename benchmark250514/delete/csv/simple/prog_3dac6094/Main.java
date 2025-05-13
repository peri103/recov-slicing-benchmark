import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with allowDuplicateHeaderNames set to true
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withAllowDuplicateHeaderNames(true);

        // Create a CSVRecord for demonstration purposes
        String[] headers = {"name", "age", "name"};
        String[] values = {"Alice", "30", "Bob"};
        CSVRecord record = CSVRecord.parse(headers, values);

        // Check if a specific header is set in the record
        /* read */ boolean isSet = record.isSet("name");
        System.out.println(isSet);
    }
}