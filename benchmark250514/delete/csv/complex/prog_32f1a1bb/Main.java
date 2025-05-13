import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with a null string setting
        CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL");

        // Create a sample CSV record for demonstration
        String[] data = {"value1", null, "value3"};
        CSVRecord record = CSVFormat.DEFAULT.parse(Arrays.asList(data)).iterator().next();

        // Create a list to store CSV records
        List<CSVRecord> recordList = new ArrayList<>();
        recordList.add(record);

        // Use the write method
        /* write */ format = format.withNullString("NULL");

        // Additional logic: Process records and calculate something
        int nullCount = 0;
        for (CSVRecord rec : recordList) {
            for (int i = 0; i < rec.size(); i++) {
                if (!rec.isSet(i)) {
                    nullCount++;
                }
            }
        }

        // More complex logic: Create another CSVRecord
        String[] data2 = {"value4", "value5", null};
        CSVRecord record2 = CSVFormat.DEFAULT.parse(Arrays.asList(data2)).iterator().next();
        recordList.add(record2);

        // Use the read method
        /* read */ boolean isSet = record.isSet(1);

        // Print the result
        System.out.println("Is the second column set in the first record? " + isSet);

        // Additional logic: Calculate total null entries in all records
        int totalNullCount = 0;
        for (CSVRecord rec : recordList) {
            for (int i = 0; i < rec.size(); i++) {
                if (!rec.isSet(i)) {
                    totalNullCount++;
                }
            }
        }

        // Print the total null count
        System.out.println("Total null entries in all records: " + totalNullCount);
    }
}