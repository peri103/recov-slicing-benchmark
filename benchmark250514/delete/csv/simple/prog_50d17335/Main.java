import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize a CSVFormat object
        CSVFormat format = CSVFormat.DEFAULT;
        
        // Use the write method to modify the format
        /* write */ format = format.withIgnoreSurroundingSpaces(true);

        // Create a mock CSVRecord for demonstration purposes
        String[] values = {"value1", "value2"};
        CSVRecord record = CSVRecord.parse(format, values);

        // Use the read method to check if a specific position is set
        /* read */ boolean isSet = record.isSet(0);

        // Output the result
        System.out.println("Is the first position set? " + isSet);
    }
}