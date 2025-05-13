import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with ignoring empty lines
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withIgnoreEmptyLines(true);

        // Create a mock CSVRecord to demonstrate isSet method
        String[] data = {"value1", "value2"};
        CSVRecord record = CSVRecord.parse(data, format);

        // Check if a specific index is set in the CSVRecord
        /* read */ boolean isSet = record.isSet(0);
        System.out.println(isSet);
    }
}