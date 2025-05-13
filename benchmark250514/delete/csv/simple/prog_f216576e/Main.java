import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat object
        CSVFormat format = CSVFormat.DEFAULT;
        
        // Apply write method
        /* write */ format = format.withIgnoreHeaderCase(true);

        // Create a sample CSVRecord object for demonstration
        String[] header = {"Name", "Age", "Location"};
        String[] values = {"Alice", "30", "Wonderland"};
        CSVRecord record = CSVRecord.parse(values, format, header);

        // Apply read method
        /* read */ boolean isMapped = record.isMapped("name");

        // Print the result
        System.out.println("Is 'name' mapped? " + isMapped);
    }
}