import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with the desired configuration
        CSVFormat format = CSVFormat.DEFAULT;
        
        // Use the write method: withIgnoreHeaderCase
        /* write */ format = format.withIgnoreHeaderCase();

        // Create a dummy CSVRecord for demonstration
        CSVRecord record = new CSVRecord(Collections.emptyMap(), Collections.emptyMap(), 0, format);

        // Use the read method: isMapped
        /* read */ boolean isMapped = record.isMapped("dummyHeader");

        System.out.println(isMapped);
    }
}