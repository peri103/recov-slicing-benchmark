import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize the CSV format object
        CSVFormat csvFormat = CSVFormat.DEFAULT;

        // Modify the CSVFormat to allow missing column names
        /* write */ csvFormat = csvFormat.withAllowMissingColumnNames();

        // Create a mock CSVRecord for demonstration purposes
        CSVRecord csvRecord = CSVRecord.parse("value1,value2,value3", csvFormat);

        // Initialize an ArrayList to store CSV records
        ArrayList<CSVRecord> records = new ArrayList<>();

        // Add the CSVRecord to the list
        records.add(csvRecord);

        // Perform some operations on the list
        for (CSVRecord record : records) {
            // Print each record's content
            System.out.println(record);
        }

        // Initialize another CSVFormat object
        CSVFormat anotherFormat = CSVFormat.DEFAULT.withHeader("Header1", "Header2", "Header3");

        // Create another CSVRecord using the new format
        CSVRecord anotherRecord = CSVRecord.parse("data1,data2,data3", anotherFormat);
        
        // Add the new record to the list
        records.add(anotherRecord);

        // Perform more operations on the list
        for (CSVRecord record : records) {
            // Print each record's content
            System.out.println(record);
        }

        // Check if a specific column is set in the original CSVRecord
        /* read */ boolean isSet = csvRecord.isSet("value2");

        // Print the result
        System.out.println(isSet);

        // Perform additional unrelated operations
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 10);
        }
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}