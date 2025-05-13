import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize the CSVFormat object
        CSVFormat format = CSVFormat.DEFAULT;
        
        // Use the write method
        /* write */ format = format.withTrailingDelimiter();
        
        // Create a dummy CSVRecord object for demonstration purposes
        String[] recordData = {"data1", "data2"};
        CSVRecord record = CSVRecord.parse(recordData, format);
        
        // Use the read method
        /* read */ boolean isSet = record.isSet(0);
        
        // Print the result
        System.out.println(isSet);
    }
}