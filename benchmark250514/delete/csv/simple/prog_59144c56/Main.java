import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize the CSVFormat object
        CSVFormat format = CSVFormat.DEFAULT;

        // Use the write method to modify the format
        /* write */ format = format.withTrailingDelimiter();

        // Create a sample CSV record to demonstrate the read method
        List<String> recordValues = Arrays.asList("value1", "value2");
        CSVRecord record = new CSVRecord(recordValues, null, format, 0, 0);

        // Use the read method to check if a column is set
        /* read */ boolean isSet = record.isSet(0);
        
        // Print the result
        System.out.println(isSet);
    }
}