import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with default format
        CSVFormat format = CSVFormat.DEFAULT;

        // Use the write method to modify the format
        /* write */ format = format.withIgnoreSurroundingSpaces(true);

        // Simulate a CSVRecord (normally obtained from parsing a CSV file)
        CSVRecord record = new CSVRecord(format, new String[]{"value1", "value2"}, null, 0, 0);

        // Use the read method to check consistency
        /* read */ boolean isConsistent = record.isConsistent();

        // Output the result
        System.out.println(isConsistent);
    }
}