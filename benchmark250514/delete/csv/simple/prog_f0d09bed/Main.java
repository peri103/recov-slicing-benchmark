import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with the write method
        CSVFormat format = CSVFormat.DEFAULT.withAllowMissingColumnNames(true);
        
        // Create a mock CSVRecord for demonstration purposes
        List<String> values = Arrays.asList("value1", "value2");
        CSVRecord record = new CSVRecord(values, null, format, 0, 0);

        // Use the read method to check if a column is set
        /* read */ boolean isSet = record.isSet("value1");
        
        System.out.println("Is 'value1' set: " + isSet);
    }
}