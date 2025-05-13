import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat object
        CSVFormat format = CSVFormat.DEFAULT;
        
        // Use the write method to modify the CSVFormat
        /* write */ format = format.withAllowDuplicateHeaderNames(true);

        // Sample CSV record data
        String[] headers = {"name", "age", "name"};
        String[] values = {"Alice", "30", "Bob"};
        
        // Create a CSVRecord object
        CSVRecord record = CSVRecord.parse(Arrays.asList(values), Arrays.asList(headers), format);

        // Use the read method to check if a specific header is mapped
        /* read */ boolean isMapped = record.isMapped("name");
        
        // Output the result
        System.out.println("Is 'name' header mapped? " + isMapped);
    }
}