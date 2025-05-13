import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with trimming enabled
        CSVFormat csvFormat = CSVFormat.DEFAULT;
        /* write */ csvFormat = csvFormat.withTrim();
        
        // Create a CSVRecord for demonstration
        String[] headers = {"Name", "Age", "Country"};
        String[] values = {"John", "30", "USA"};
        CSVRecord record = new CSVRecord(null, values, headers, null, null, 0, 0, 0);

        // Check if a field is mapped
        /* read */ boolean isMapped = record.isMapped("Name");
        System.out.println("Is 'Name' mapped: " + isMapped);
    }
}