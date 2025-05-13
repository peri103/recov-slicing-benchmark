import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with a null string
        CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL");

        // Create a map to store CSVRecords
        Map<Integer, CSVRecord> recordMap = new HashMap<>();

        // Create CSVRecords using the format
        List<CSVRecord> records = format.parse(Arrays.asList("value1, NULL, value3", "valueA, valueB, NULL")).getRecords();

        // Populate the map with CSVRecords
        for (int i = 0; i < records.size(); i++) {
            recordMap.put(i, records.get(i));
        }

        // Perform operations on the records
        for (CSVRecord rec : records) {
            for (int i = 0; i < rec.size(); i++) {
                System.out.println("Value at index " + i + ": " + rec.get(i));
            }
        }

        // Create another CSVFormat with different null string
        CSVFormat anotherFormat = CSVFormat.DEFAULT.withNullString("N/A");

        // More complex logic using anotherFormat
        CSVRecord anotherRecord = anotherFormat.parse(Arrays.asList("data1, N/A, data3")).get(0);
        System.out.println("Another record value at index 1: " + anotherRecord.get(1));

        // Check if the second value is set (it should be null)
        /* read */ boolean isSet = recordMap.get(0).isSet(1);

        // Print the result
        System.out.println("Is the second value set in the first record? " + isSet);  // Expected to print false since "NULL" is considered as null

        // Additional logic to manipulate and display data
        for (Map.Entry<Integer, CSVRecord> entry : recordMap.entrySet()) {
            System.out.println("Record " + entry.getKey() + ":");
            CSVRecord rec = entry.getValue();
            for (int i = 0; i < rec.size(); i++) {
                System.out.println("Index " + i + ": " + rec.get(i));
            }
        }
    }
}