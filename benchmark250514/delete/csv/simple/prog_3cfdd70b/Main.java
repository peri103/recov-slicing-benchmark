import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with default settings
        CSVFormat format = CSVFormat.DEFAULT;

        // Use the write method to modify the format
        /* write */ format = format.withIgnoreHeaderCase();

        // Simulate a CSVRecord for demonstration
        // Normally, CSVRecord is obtained by parsing a CSV file, but here we create a dummy object
        CSVRecord record = new CSVRecord(null, null, format, 0, null);

        // Use the read method to check if a specific header is mapped
        /* read */ boolean isMapped = record.isMapped("dummyHeader");

        // Output the result
        System.out.println(isMapped);
    }
}