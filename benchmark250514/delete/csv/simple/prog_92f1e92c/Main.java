import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat object
        CSVFormat format = CSVFormat.DEFAULT;
        
        // Use the write method to modify the format
        /* write */ format = format.withIgnoreHeaderCase(true);

        // Create a CSVRecord object for demonstration purposes
        // Normally, CSVRecord would be obtained from parsing a CSV file, but here we simulate it
        CSVRecord record = new CSVRecord(null, null, null, format);

        // Use the read method to check if the record is mapped
        /* read */ boolean isMapped = record.isMapped("header");

        // Output the result
        System.out.println(isMapped);
    }
}