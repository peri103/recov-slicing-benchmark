import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with ignore header case
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withIgnoreHeaderCase(true);
        
        // Create a CSVRecord for demonstration purposes
        String[] values = {"header", "value"};
        CSVRecord record = new CSVRecord(null, values, format, 0, 0);

        // Read isMapped from CSVRecord
        /* read */ boolean isMapped = record.isMapped("header");
        
        // Output the result
        System.out.println("Is 'header' mapped: " + isMapped);
    }
}