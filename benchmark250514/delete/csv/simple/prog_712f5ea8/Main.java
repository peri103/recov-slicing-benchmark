import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize a CSVFormat instance
        CSVFormat format = CSVFormat.DEFAULT;

        // Use the write method to set the format to ignore empty lines
        /* write */ format = format.withIgnoreEmptyLines();

        // Create a CSVRecord instance manually for demonstration purposes
        CSVRecord record = new CSVRecord(null, new String[]{"value1", "value2"}, null, format);

        // Use the read method to check consistency of the CSVRecord
        /* read */ boolean isConsistent = record.isConsistent();

        // Output the result
        System.out.println("Is the CSVRecord consistent? " + isConsistent);
    }
}