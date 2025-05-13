import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with default settings
        CSVFormat format = CSVFormat.DEFAULT;
        
        // Use the write method withTrim to modify the format
        /* write */ format = format.withTrim();
        
        // Create a sample CSVRecord for demonstration purposes
        String[] values = {"value1", "value2"};
        CSVRecord record = CSVRecord.parse(format, values);
        
        // Use the read method isMapped to check if the record is mapped
        /* read */ boolean isMapped = record.isMapped("value1");
        
        // Print the result
        System.out.println(isMapped);
    }
}