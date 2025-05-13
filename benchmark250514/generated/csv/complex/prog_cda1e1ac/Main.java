import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a trailing delimiter
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withTrailingDelimiter();

            // Sample CSV data
            String csvData = "header1,header2,header3\nvalue1,value2,value3,"; // Note the trailing comma

            // Parse the CSV data
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();

            // Additional logic for processing CSV data
            Map<String, String> recordMap = new HashMap<>();
            for (CSVRecord record : records) {
                recordMap.put("header1", record.get("header1"));
                recordMap.put("header2", record.get("header2"));
                recordMap.put("header3", record.get("header3"));
            }

            // Print out the map
            for (Map.Entry<String, String> entry : recordMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

            // Perform a calculation
            int sum = 0;
            for (int i = 0; i < 100; i++) {
                sum += i;
            }
            System.out.println("Sum of numbers from 0 to 99: " + sum);

            // Check if a particular header is set in the first record
            /* read */ boolean isSet = records.get(0).isSet("header3");
            
            System.out.println("Is 'header3' set? " + isSet);

            // Additional unrelated logic
            int product = 1;
            for (int i = 1; i <= 10; i++) {
                product *= i;
            }
            System.out.println("Product of numbers from 1 to 10: " + product);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}