import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize a CSVFormat instance
        CSVFormat format = CSVFormat.DEFAULT;
        
        // Use the write method to modify the format
        /* write */ format = format.withTrailingDelimiter();
        
        // Create a sample CSVRecord for demonstration
        String[] values = {"value1", "value2", "value3"};
        CSVRecord record = new CSVRecord(values, null, format);
        
        // Use the read method to check if a certain position is set
        /* read */ boolean isSet = record.isSet(1);
        
        // Print the result
        System.out.println(isSet);
    }
}