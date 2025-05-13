import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Create a CSVFormat instance
        CSVFormat format = CSVFormat.DEFAULT;

        // Use the write method to set the format to ignore empty lines
        /* write */ format = format.withIgnoreEmptyLines(true);

        // Create a CSVRecord instance with some sample data
        CSVRecord record = new CSVRecord(null, new String[]{"value1", "value2"}, format);

        // Use the read method to check if a specific index is set
        /* read */ boolean isSet = record.isSet(0);

        // Print the result
        System.out.println("Is index 0 set? " + isSet);
    }
}