import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize the CSVFormat object
        CSVFormat format = CSVFormat.DEFAULT;

        // Use the write method
        /* write */ format = format.withIgnoreSurroundingSpaces(true);

        // Create a CSVRecord object to read from
        CSVRecord record = new CSVRecord(null, null, null, null, null) {
            @Override
            public boolean isConsistent() {
                return true;
            }
        };

        // Use the read method
        /* read */ boolean isConsistent = record.isConsistent();

        // Print the result
        System.out.println(isConsistent);
    }
}