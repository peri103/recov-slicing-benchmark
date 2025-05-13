import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with ignoreHeaderCase set to true
        /* write */ CSVFormat format = CSVFormat.DEFAULT.withIgnoreHeaderCase(true);

        // Create a sample CSVRecord for demonstration purposes
        CSVRecord record = new CSVRecord() {
            @Override
            public boolean isMapped(String name) {
                // Simulate behavior based on header case ignoring
                return format.getIgnoreHeaderCase() && name.equalsIgnoreCase("header");
            }

            // Other methods would be implemented here if necessary
        };

        // Check if the record is mapped using the isMapped method
        /* read */ boolean isMapped = record.isMapped("HEADER");
        System.out.println(isMapped);
    }
}