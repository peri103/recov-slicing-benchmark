import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize the CSVFormat object
        CSVFormat format = CSVFormat.DEFAULT;
        
        // Use the write method to configure the format
        /* write */ format = format.withAllowMissingColumnNames(true);
        
        // Create a CSVRecord for demonstration purposes
        String[] values = {"value1", "value2", "value3"};
        CSVRecord record = CSVRecord.parse(values, format);
        
        // Use the read method to check if a column is set
        /* read */ boolean isSet = record.isSet(1);
        
        // Output the result
        System.out.println("Is column set: " + isSet);
    }
}