import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Create a CSVFormat object and configure it
        CSVFormat csvFormat = CSVFormat.DEFAULT;
        /* write */ csvFormat = csvFormat.withIgnoreSurroundingSpaces();

        // Simulate a CSVRecord for demonstration purposes
        // In a real scenario, this would be obtained from parsing a CSV file
        String[] values = {"value1", "value2"};
        CSVRecord record = new CSVRecord(null, values, null, 0, 0);

        // Check if a specific index is set in the CSVRecord
        /* read */ boolean isSet = record.isSet(0);
        System.out.println(isSet);
    }
}