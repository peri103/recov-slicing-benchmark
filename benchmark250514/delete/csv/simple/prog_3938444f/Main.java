import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat
        CSVFormat format = CSVFormat.DEFAULT;

        // Use the write method to modify the format
        /* write */ format = format.withIgnoreHeaderCase(true);

        // Create a sample CSVRecord for demonstration
        String[] values = {"Name", "Age", "Country"};
        CSVRecord record = new CSVRecord(null, values, 0, 0);

        // Use the read method to check if a header is mapped
        /* read */ boolean isMapped = record.isMapped("name");

        // Output the result
        System.out.println("Is 'name' mapped: " + isMapped);
    }
}