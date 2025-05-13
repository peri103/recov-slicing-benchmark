import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with a trailing delimiter
        CSVFormat csvFormat = CSVFormat.DEFAULT.withTrailingDelimiter();
        
        // Simulate CSV input data
        String csvData = "name,age,city\nJohn,30,New York\nJane,25,Los Angeles";
        
        try {
            // Parse the CSV data using the CSVFormat
            CSVParser parser = CSVParser.parse(new StringReader(csvData), csvFormat);
            
            // Process all records and store data in a map
            Map<String, List<String>> dataMap = new HashMap<>();
            for (CSVRecord record : parser) {
                String name = record.get("name");
                List<String> details = new ArrayList<>();
                details.add(record.get("age"));
                details.add(record.get("city"));
                dataMap.put(name, details);
            }
            
            // Perform some unrelated operations
            List<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                numbers.add(i * 2);
            }
            
            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            System.out.println("Sum of numbers: " + sum);
            
            // Assume we want to check the first record
            CSVRecord firstRecord = parser.getRecords().get(0);
            
            // Additional unrelated operations
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, List<String>> entry : dataMap.entrySet()) {
                sb.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
            }
            System.out.println("Data Map Contents:\n" + sb.toString());
            
            // Check if a certain column is set
            /* read */ boolean isSet = firstRecord.isSet("age");
            System.out.println("Is 'age' column set in the first record? " + isSet);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}