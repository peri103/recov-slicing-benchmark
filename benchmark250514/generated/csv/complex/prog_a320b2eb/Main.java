import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSVFormat instance and set the header using the write method
            CSVFormat format = CSVFormat.DEFAULT.withHeader("Name", "Age", "Country");
            
            // Sample CSV data
            String csvData = "Name,Age,Country\nJohn,25,USA\nAlice,30,UK";
            
            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            
            // Create a map to store the records
            Map<String, CSVRecord> recordMap = new HashMap<>();
            
            // Iterate over records and store them in the map
            for (CSVRecord record : parser) {
                recordMap.put(record.get("Name"), record);
            }
            
            // Perform some unrelated operations
            int sum = 0;
            for (int i = 1; i <= 10; i++) {
                sum += i;
            }
            System.out.println("Sum of numbers from 1 to 10: " + sum);
            
            // Perform operations on the map
            if (recordMap.containsKey("John")) {
                CSVRecord johnRecord = recordMap.get("John");
                System.out.println("John's Age: " + johnRecord.get("Age"));
            }
            
            // Get the first record
            CSVRecord firstRecord = parser.getRecords().get(0);
            
            // Check if a specific header is set using the read method
            /* read */ boolean isNameSet = firstRecord.isSet("Name");
            
            // Output the result
            System.out.println("Is 'Name' header set? " + isNameSet);
            
            // Additional logic to manipulate data
            for (CSVRecord record : parser) {
                System.out.println(record.get("Country"));
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}