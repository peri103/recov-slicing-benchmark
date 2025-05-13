import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat object
        CSVFormat format = CSVFormat.DEFAULT;
        
        // Use the write method to modify the format
        /* write */ format = format.withTrailingDelimiter();

        // Create a dummy CSVRecord for demonstration purposes
        // Normally, CSVRecord is created by parsing CSV data, but here we simulate it
        CSVRecord record = new CSVRecord(null, new String[]{"value1", "value2"}, null, null, 0, null);

        // Use the read method to check if a field is set
        /* read */ boolean isSet = record.isSet(0);

        // Output the result
        System.out.println(isSet);
    }
}