import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat object
        CSVFormat csvFormat = CSVFormat.DEFAULT;
        
        // Use the write method to modify the CSVFormat object
        /* write */ csvFormat = csvFormat.withIgnoreHeaderCase(true);

        // Prepare a sample CSVRecord list to simulate reading
        List<String> headers = Arrays.asList("Name", "Age", "Country");
        List<String> values = Arrays.asList("John Doe", "30", "USA");
        CSVRecord record = new CSVRecord(values, headers, 0, 0);

        // Use the read method to check if a header is mapped
        /* read */ boolean isMapped = record.isMapped("name");

        // Output the result
        System.out.println("Is 'name' mapped: " + isMapped);
    }
}