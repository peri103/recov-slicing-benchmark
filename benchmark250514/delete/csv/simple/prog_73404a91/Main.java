import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with a null string
        CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL");
        
        // Create a CSVRecord for demonstration, normally you would parse it from a CSV file
        CSVRecord record = new CSVRecord(format, Arrays.asList("value1", "NULL", "value3"), null, 0, 0);
        
        // Write operation: Configure the CSVFormat to use "NULL" as the null string
        /* write */ format = format.withNullString("NULL");
        
        // Read operation: Check if a specific index is set in the CSVRecord
        /* read */ boolean isSet = record.isSet(1); // Check if the second element is set
        
        System.out.println("Is the second element set? " + isSet);
    }
}