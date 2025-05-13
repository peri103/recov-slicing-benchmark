import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with the write method
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withAllowMissingColumnNames(true);

        // Create a CSVRecord for demonstration purposes
        String[] data = {"value1", "value2"};
        CSVRecord record = new CSVRecord(data, format);

        // Use the read method to check if a column is set
        /* read */ boolean isSet = record.isSet("value1");
        System.out.println(isSet);
    }
}