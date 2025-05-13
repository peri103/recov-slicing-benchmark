import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with default format
        CSVFormat format = CSVFormat.DEFAULT;
        
        // Use the write method to modify the format
        /* write */ format = format.withAllowMissingColumnNames(true);
        
        // Create a sample CSVRecord using the modified format
        // Note: Normally, CSVRecord is obtained by parsing a CSV file, 
        // but for the sake of this example, we are manually creating it.
        String[] values = {"value1", "value2"};
        CSVRecord record = new CSVRecord(values, format, 0, 0);

        // Use the read method to check if a column index is set
        /* read */ boolean isSet = record.isSet(0);
        
        // Output the result
        System.out.println("Is column index 0 set? " + isSet);
    }
}