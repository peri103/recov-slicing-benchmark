import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Prepare a CSV string for parsing
            String csvData = "header1, header2\nvalue1, value2";
            Reader input = new StringReader(csvData);

            // Create a CSVFormat instance with trim enabled
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withTrim();

            // Create a map to demonstrate additional complexity
            Map<String, Integer> headerMap = new HashMap<>();
            headerMap.put("header1", 0);
            headerMap.put("header2", 1);

            // Parse the CSV data using the configured format
            CSVParser parser = new CSVParser(input, format);

            // Read the first record
            CSVRecord record = parser.getRecords().get(0);

            // Perform operations on the record's values
            String value1 = record.get(0);
            String value2 = record.get(1);
            int sumLengths = value1.length() + value2.length();
            System.out.println("Sum of lengths of values: " + sumLengths);

            // Use the map to find the index of a header and print its value
            int headerIndex = headerMap.get("header1");
            System.out.println("Value at 'header1': " + record.get(headerIndex));

            // Check if a header is mapped in the record
            /* read */ boolean isMapped = record.isMapped("header1");
            
            // Output the result
            System.out.println("Is 'header1' mapped: " + isMapped);
            
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}