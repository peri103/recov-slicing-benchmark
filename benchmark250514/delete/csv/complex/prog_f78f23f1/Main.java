import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with default settings
        CSVFormat format = CSVFormat.DEFAULT;
        
        // Create a list of strings to simulate CSV data
        List<String> csvData = Arrays.asList("value1", "NULL", "value3", "value4");

        // Create a CSVRecord using the simulated data
        CSVRecord record = CSVRecord.parse(csvData, format);

        // Perform operations on CSVRecord
        for (String value : csvData) {
            // Check if the value is set in the record
            boolean checkSet = record.isSet(value);
            System.out.println("Is " + value + " set? " + checkSet);
        }
        
        // Modify CSVFormat to handle null strings
        /* write */ format = format.withNullString("NULL");

        // Additional operations on CSVRecord
        int nullCount = 0;
        for (String value : csvData) {
            if ("NULL".equals(value)) {
                nullCount++;
            }
        }
        System.out.println("Number of NULL values: " + nullCount);

        // Check if a specific value is set using the modified format
        /* read */ boolean isSet = record.isSet("NULL");
        System.out.println("Is 'NULL' set after modification? " + isSet);

        // Further processing with CSVRecord
        for (int i = 0; i < csvData.size(); i++) {
            System.out.println("Value at index " + i + ": " + csvData.get(i));
        }
        
        // Perform additional unrelated operations
        int sum = 0;
        for (int i = 0; i < csvData.size(); i++) {
            if (!"NULL".equals(csvData.get(i))) {
                sum += csvData.get(i).length();
            }
        }
        System.out.println("Sum of lengths of non-NULL values: " + sum);
    }
}