import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Create a CSVFormat instance and configure it using the write method
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withIgnoreSurroundingSpaces(true);

        // Simulate a CSVRecord with a sample record
        String[] recordData = {"value1", "value2"};
        CSVRecord record = CSVRecord.parse(recordData, format);

        // Use the read method to check if a specific index is set
        /* read */ boolean isSet = record.isSet(0);

        // Print the result
        System.out.println("Is value at index 0 set? " + isSet);
    }
}