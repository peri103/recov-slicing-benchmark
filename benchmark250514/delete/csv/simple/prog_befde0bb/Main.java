import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with trailing delimiter
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withTrailingDelimiter();

        // Create a sample CSVRecord for demonstration
        String[] values = {"value1", "value2", "value3"};
        CSVRecord record = new CSVRecord(values, null, format);

        // Read operation to check if a specific index is set
        /* read */ boolean isSet = record.isSet(1);
        System.out.println("Is index 1 set? " + isSet);
    }
}