import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Create a CSVFormat object
        CSVFormat format = CSVFormat.DEFAULT;
        
        // Use the write method
        /* write */ format = format.withIgnoreHeaderCase();
        
        // Simulate a CSVRecord object
        CSVRecord record = new CSVRecord(null, null, null, format);
        
        // Use the read method
        /* read */ boolean isMapped = record.isMapped("columnName");
        
        // Output the result
        System.out.println(isMapped);
    }
}