import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with a default format
        CSVFormat format = CSVFormat.DEFAULT;
        
        // Use write method to set a delimiter
        /* write */ format = format.withDelimiter(';');
        
        // Create a mock CSVRecord for demonstration since we cannot read from actual CSV
        CSVRecord record = new CSVRecord(format, new String[] {"value1", "value2"}, 1, 0);
        
        // Use read method to get the string representation of the record
        /* read */ String recordString = record.toString();
        
        // Print the result
        System.out.println(recordString);
    }
}