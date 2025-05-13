import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Create a CSVFormat instance
        CSVFormat format = CSVFormat.DEFAULT;
        
        // Use the write method to configure the CSVFormat
        /* write */ format = format.withAllowMissingColumnNames(true);

        // Create a CSVRecord instance (normally this would be obtained from parsing a CSV file)
        // For demonstration purposes, we'll create a mock CSVRecord with a single column
        String[] values = {"value"};
        CSVRecord record = new CSVRecord(null, values, null, 0, 0);

        // Use the read method to check if a column is set
        /* read */ boolean isSet = record.isSet(0);
        
        // Output the result
        System.out.println(isSet);
    }
}