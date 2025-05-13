import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize the CSVFormat object
        CSVFormat format = CSVFormat.DEFAULT;
        
        // Use the write method to modify the format object
        /* write */ format = format.withIgnoreEmptyLines(true);

        // Simulate reading a CSVRecord (since we can't actually parse a CSV without external input)
        String[] values = {"value1", "", "value3"};
        CSVRecord record = CSVRecord.parse(values, format);

        // Use the read method to check if a specific index is set
        /* read */ boolean isSet = record.isSet(0);  // Check if the first index is set

        // Output the result
        System.out.println("Is the first index set? " + isSet);
    }
}