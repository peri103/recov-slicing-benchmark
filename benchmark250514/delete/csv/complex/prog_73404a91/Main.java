import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with a null string
        CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL");
        
        // Create a CSVRecord for demonstration, normally you would parse it from a CSV file
        CSVRecord record = new CSVRecord(format, Arrays.asList("value1", "NULL", "value3"), null, 0, 0);
        
        // Write operation: Configure the CSVFormat to use "NULL" as the null string
        /* write */ format = format.withNullString("NULL");
        
        // Additional complexity: Use a list to store and manipulate CSVRecords
        List<CSVRecord> records = new ArrayList<>();
        records.add(record);
        
        // Perform some operations on the list
        for (CSVRecord rec : records) {
            System.out.println("Record size: " + rec.size());
        }
        
        // Add more records to increase complexity
        CSVRecord record2 = new CSVRecord(format, Arrays.asList("value4", "value5", "NULL"), null, 1, 0);
        records.add(record2);
        
        // Perform additional operations
        int totalSize = 0;
        for (CSVRecord rec : records) {
            totalSize += rec.size();
        }
        System.out.println("Total size of all records: " + totalSize);
        
        // Read operation: Check if a specific index is set in the CSVRecord
        /* read */ boolean isSet = record.isSet(1); // Check if the second element is set
        
        System.out.println("Is the second element set? " + isSet);
        
        // Further complexity: Modify the records list
        records.remove(record2);
        System.out.println("Records count after removal: " + records.size());
    }
}