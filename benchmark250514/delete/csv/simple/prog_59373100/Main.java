import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat object
        CSVFormat format = CSVFormat.DEFAULT;
        
        // Apply write method
        /* write */ format = format.withIgnoreHeaderCase(true);
        
        // Create a mock CSVRecord for demonstration purposes
        // Normally, CSVRecord is obtained by parsing a CSV file using CSVParser
        CSVRecord record = new CSVRecord(null, null, null, null, format);
        
        // Use read method
        /* read */ boolean isMapped = record.isMapped("header");
        
        // Print the result
        System.out.println(isMapped);
    }
}