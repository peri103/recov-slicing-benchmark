import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat
        CSVFormat format = CSVFormat.DEFAULT;
        
        // Write operation: Configure the format to allow missing column names
        /* write */ format = format.withAllowMissingColumnNames();

        // Simulate a CSV record
        List<String> data = Arrays.asList("data1", "data2", "data3");
        CSVRecord record = new CSVRecord(data, null, format, 0, 0);

        // Read operation: Check if a column is set
        /* read */ boolean isSet = record.isSet(1);
        
        // Output the result
        System.out.println("Is column 1 set? " + isSet);
    }
}