import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with default format
        CSVFormat format = CSVFormat.DEFAULT;

        // Create a list to store CSVRecords
        List<CSVRecord> recordList = new ArrayList<>();

        // Use the write method to set a quote character
        /* write */ format = format.withQuote('"');

        // Create a sample CSVRecord
        String[] values1 = {"value1", "value2", "value3"};
        CSVRecord record1 = new CSVRecord(null, values1, null, 0, 0);
        recordList.add(record1);

        // Create another CSVRecord
        String[] values2 = {"value4", "value5", "value6"};
        CSVRecord record2 = new CSVRecord(null, values2, null, 0, 0);
        recordList.add(record2);

        // Perform operations on the list of CSVRecords
        for (CSVRecord rec : recordList) {
            System.out.println("Record: " + rec.toString());
        }

        // Use the read method to get the string representation of the first CSVRecord
        /* read */ String recordString = record1.toString();

        // Print the result
        System.out.println("Read Record String: " + recordString);

        // Additional code to manipulate data
        List<String[]> dataList = new ArrayList<>();
        dataList.add(values1);
        dataList.add(values2);

        for (String[] data : dataList) {
            for (String value : data) {
                System.out.println("Data Value: " + value);
            }
        }

        // Create another CSVFormat and CSVRecord to demonstrate similar operations
        CSVFormat anotherFormat = CSVFormat.DEFAULT.withQuote('\'');
        String[] values3 = {"value7", "value8", "value9"};
        CSVRecord record3 = new CSVRecord(null, values3, null, 0, 0);
        System.out.println("Another Record: " + record3.toString());
    }
}