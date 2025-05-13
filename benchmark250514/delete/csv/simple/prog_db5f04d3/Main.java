import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat object
        CSVFormat format = CSVFormat.DEFAULT;
        
        // Use the write method to modify the CSVFormat object
        /* write */ format = format.withAllowDuplicateHeaderNames(true);

        // Create a CSVRecord object for demonstration purposes
        // In real scenarios, CSVRecord is typically obtained from parsing a CSV file
        CSVRecord record = new CSVRecord(null, new String[]{"header1"}, new String[]{"value1"}, 0, format);

        // Use the read method to check if a header is mapped
        /* read */ boolean isMapped = record.isMapped("header1");

        // Output the result
        System.out.println("Is 'header1' mapped? " + isMapped);
    }
}