import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with a setting to allow missing column names
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withAllowMissingColumnNames();

        // Simulate a CSVRecord for demonstration purposes
        // Note: In practice, CSVRecord would be obtained from parsing a CSV file
        String[] values = {"value1", "value2"};
        CSVRecord record = new CSVRecord(format, values, null, 0, 0);

        // Check if a specific index is set in the record
        /* read */ boolean isSet = record.isSet(0);
        System.out.println(isSet);
    }
}