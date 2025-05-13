import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat object
        CSVFormat csvFormat = CSVFormat.DEFAULT;
        
        // Use the write method
        /* write */ csvFormat = csvFormat.withIgnoreHeaderCase();
        
        // Create a CSVRecord object for demonstration purposes
        String[] headers = {"Name", "Age", "Country"};
        String[] values = {"Alice", "30", "USA"};
        CSVRecord csvRecord = CSVFormat.DEFAULT.parse(new java.io.StringReader("Name,Age,Country\nAlice,30,USA")).getRecords().get(0);
        
        // Use the read method
        /* read */ boolean isMapped = csvRecord.isMapped("Name");
        
        // Output the result of the read operation
        System.out.println(isMapped);
    }
}