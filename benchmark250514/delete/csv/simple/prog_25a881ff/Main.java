import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Create a CSVFormat object
        CSVFormat format = CSVFormat.DEFAULT;
        
        // Use the write method to modify the format
        /* write */ format = format.withIgnoreHeaderCase();

        // Create a dummy CSVRecord object for demonstration purposes
        CSVRecord record = new CSVRecord() {
            @Override
            public boolean isMapped(String name) {
                // Simulate the record being mapped
                return true;
            }

            // Other overridden methods would go here, but are omitted for simplicity
        };

        // Use the read method to check if a header is mapped
        /* read */ boolean isMapped = record.isMapped("headerName");
        
        // Print the result
        System.out.println("Is header mapped: " + isMapped);
    }
}