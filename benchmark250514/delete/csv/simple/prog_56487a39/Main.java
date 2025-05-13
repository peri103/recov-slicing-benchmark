import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with default settings
        CSVFormat format = CSVFormat.DEFAULT;
        
        // Use the write method to modify the CSVFormat
        /* write */ format = format.withIgnoreHeaderCase(true);
        
        // Create a CSVRecord to read from
        // Since CSVRecord is an interface, we'll create a mock implementation for demonstration
        CSVRecord record = new MockCSVRecord(format);
        
        // Use the read method to check if a header is mapped
        /* read */ boolean isMapped = record.isMapped("header");
        
        // Print the result
        System.out.println(isMapped);
    }
}

// Mock implementation of CSVRecord for demonstration purposes
class MockCSVRecord implements CSVRecord {
    private CSVFormat format;

    public MockCSVRecord(CSVFormat format) {
        this.format = format;
    }

    @Override
    public boolean isMapped(String name) {
        // Simulate checking if a header is mapped, taking into account the format settings
        if (format.getIgnoreHeaderCase()) {
            // Simulate case-insensitive header mapping
            return true; // Assume headers are mapped for demonstration
        }
        return false;
    }

    // Other methods from CSVRecord are omitted for brevity
}