import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with default format
        CSVFormat format = CSVFormat.DEFAULT;
        
        // Use the write method to set a quote character
        /* write */ format = format.withQuote('"');
        
        // Create a sample CSVRecord to demonstrate the read method
        String[] values = {"value1", "value2", "value3"};
        CSVRecord record = new CSVRecord(null, values, null, 0, 0);
        
        // Use the read method to get the string representation of the CSVRecord
        /* read */ String recordString = record.toString();
        
        // Print the result
        System.out.println(recordString);
    }
}