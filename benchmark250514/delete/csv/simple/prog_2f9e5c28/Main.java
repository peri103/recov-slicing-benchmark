import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat object
        CSVFormat format = CSVFormat.DEFAULT;
        
        // Use write method to configure the format
        /* write */ format = format.withIgnoreHeaderCase(true);
        
        // Simulate a CSVRecord object (normally obtained after parsing a CSV file)
        CSVRecord record = new CSVRecord(null, null, null, 0, format);
        
        // Use read method to check if the record is mapped
        /* read */ boolean isMapped = record.isMapped("headerName");
        
        // Print the result
        System.out.println(isMapped);
    }
}