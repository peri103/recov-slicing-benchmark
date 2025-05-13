import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat and apply the write method
        CSVFormat csvFormat = CSVFormat.DEFAULT /* write */.withIgnoreHeaderCase();

        // Create a sample CSVRecord using the format
        String[] headers = {"Name", "Age", "Location"};
        String[] values = {"John", "30", "USA"};
        CSVRecord record = new CSVRecord(null, values, headers, 0, 0);

        // Use the read method to check if a header is mapped
        /* read */ boolean isMapped = record.isMapped("name");

        // Output the result
        System.out.println(isMapped);
    }
}