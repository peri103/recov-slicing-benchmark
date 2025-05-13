import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize the CSVFormat object
        CSVFormat format = CSVFormat.DEFAULT;

        // Use the write method
        /* write */ format = format.withTrailingDelimiter();

        // Create a dummy CSV data string
        String csvData = "header1,header2\nvalue1,value2\nvalue3,value4";

        // Parse the CSV data using CSVParser
        List<CSVRecord> records = null;
        try {
            CSVParser parser = new CSVParser(new StringReader(csvData), format);
            records = parser.getRecords();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Additional operations to make the program more complex
        int totalRecords = records.size();
        System.out.println("Total records: " + totalRecords);

        // Perform some operations on the records
        for (CSVRecord record : records) {
            int recordSize = record.size();
            System.out.println("Record size: " + recordSize);
            for (int i = 0; i < recordSize; i++) {
                String value = record.get(i);
                System.out.println("Value at index " + i + ": " + value);
            }
        }

        // Use the read method
        /* read */ boolean isSet = records.get(0).isSet(0);

        // Print the result
        System.out.println("Is field set: " + isSet);

        // More complex operations
        CSVFormat newFormat = CSVFormat.EXCEL.withHeader("A", "B", "C");
        try {
            CSVParser newParser = new CSVParser(new StringReader(csvData), newFormat);
            List<CSVRecord> newRecords = newParser.getRecords();
            for (CSVRecord newRecord : newRecords) {
                System.out.println("New record: " + newRecord.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}