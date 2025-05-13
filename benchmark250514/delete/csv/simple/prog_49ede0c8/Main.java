import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with the write method
        /* write */ CSVFormat format = CSVFormat.DEFAULT.withIgnoreHeaderCase(true);
        
        // Create a dummy CSVRecord to demonstrate usage
        CSVRecord record = new CSVRecord(null, Arrays.asList("Header1", "Header2"), null, format);

        // Use the read method on CSVRecord
        /* read */ boolean isMapped = record.isMapped("Header1");
        
        // Print the result
        System.out.println(isMapped);
    }
}