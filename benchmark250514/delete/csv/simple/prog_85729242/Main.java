import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with trailing delimiter
        CSVFormat csvFormat = CSVFormat.DEFAULT;
        /* write */ csvFormat = csvFormat.withTrailingDelimiter();

        // Create a mock CSVRecord for demonstration purposes
        String[] values = {"value1", "value2", "value3"};
        CSVRecord csvRecord = new CSVRecord(null, null, values, null, null);

        // Read a value from the CSVRecord
        /* read */ boolean isSet = csvRecord.isSet(1);
        System.out.println(isSet);  // Output should be true since index 1 is set
    }
}