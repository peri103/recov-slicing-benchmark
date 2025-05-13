import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Create a CSVFormat object with the desired configuration
        CSVFormat format = CSVFormat.DEFAULT;
        
        // Use the write method to set the property on the CSVFormat object
        /* write */ format = format.withAllowMissingColumnNames(true);
        
        // Create a CSVRecord object for demonstration purposes
        // Normally, you would get this from parsing a CSV file with the CSVParser
        String[] values = {"value1", "value2"};
        CSVRecord record = new CSVRecord(null, null, null, values);
        
        // Use the read method to check if a column is set
        /* read */ boolean isSet = record.isSet(0); // Check if the first column is set
        
        // Output the result
        System.out.println("Is the first column set? " + isSet);
    }
}