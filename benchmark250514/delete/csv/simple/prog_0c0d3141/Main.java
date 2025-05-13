import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with default settings
        CSVFormat format = CSVFormat.DEFAULT;
        // Use the write method to allow duplicate header names
        /* write */ format = format.withAllowDuplicateHeaderNames(true);

        // Create a mock CSVRecord for demonstration purposes
        CSVRecord record = new CSVRecord(null, null, format, 0, null);

        // Use the read method to check if the record is mapped
        /* read */ boolean isMapped = record.isMapped("someHeader");

        // Output the result
        System.out.println("Is the header mapped? " + isMapped);
    }
}