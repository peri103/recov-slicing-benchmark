import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize the CSVFormat object with a null string value
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withNullString("NULL");

        // Create a mock CSVRecord for testing
        String[] recordData = {"value1", "NULL", "value3"};
        CSVRecord record = CSVFormat.DEFAULT.parse(new java.io.StringReader(String.join(",", recordData))).getRecords().get(0);

        // Check if a specific column is set
        /* read */ boolean isSet = record.isSet(1);
        System.out.println(isSet);
    }
}