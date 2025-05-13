import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with default format
        CSVFormat format = CSVFormat.DEFAULT;
        
        // Use the write method to create a new format with trim enabled
        /* write */ format = format.withTrim();
        
        // Create a mock CSVRecord to demonstrate the read method
        // In a real scenario, CSVRecord would be obtained from parsing a CSV file
        CSVRecord record = new CSVRecord(null, null, null, format);
        
        // Use the read method to check if a specific header is mapped
        // Assuming the header "column" exists in the CSVRecord
        /* read */ boolean isMapped = record.isMapped("column");
        
        // Print the result
        System.out.println(isMapped);
    }
}