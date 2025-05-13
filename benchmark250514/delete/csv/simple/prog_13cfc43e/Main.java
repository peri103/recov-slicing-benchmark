import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with write method
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withAllowMissingColumnNames(true);

        // Prepare a dummy CSVRecord for demonstration
        List<String> values = new ArrayList<>();
        values.add("value1");
        values.add("value2");
        CSVRecord record = new CSVRecord(values, format);

        // Use read method to check if a column is set
        /* read */ boolean isSet = record.isSet("value1");
        
        // Print the result of the read operation
        System.out.println(isSet);
    }
}