import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Create a CSVFormat instance with trailing delimiter
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withTrailingDelimiter();

        // Create a dummy CSVRecord for demonstration purposes
        String[] values = {"value1", "value2"};
        CSVRecord record = new CSVRecord(null, values, null, 0, 0);

        // Check if the record is consistent
        /* read */ boolean isConsistent = record.isConsistent();
        System.out.println("Is the CSVRecord consistent? " + isConsistent);
    }
}