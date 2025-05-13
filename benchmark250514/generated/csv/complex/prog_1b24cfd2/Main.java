import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize a CSVFormat object and configure it to ignore empty lines
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withIgnoreEmptyLines(true);

            // Initialize an ArrayList to store CSV data for additional processing
            ArrayList<Map<String, String>> csvDataList = new ArrayList<>();

            // Sample CSV data
            String csvData = "name,age\nJohn,30\n\nJane,25";

            // Parse the CSV data
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();

            // Process each CSVRecord and store in the ArrayList
            for (CSVRecord record : records) {
                Map<String, String> dataMap = new HashMap<>();
                dataMap.put("name", record.get("name"));
                dataMap.put("age", record.get("age"));
                csvDataList.add(dataMap);
            }

            // Additional processing on the list
            for (Map<String, String> data : csvDataList) {
                System.out.println("Name: " + data.get("name") + ", Age: " + data.get("age"));
            }

            // Read a CSVRecord and check if a specific column is set
            CSVRecord firstRecord = records.get(0); // Get the first record
            /* read */ boolean isSet = firstRecord.isSet("name"); // Check if 'name' column is set

            // Output the result
            System.out.println("Is 'name' column set in the first record? " + isSet);

            // Perform some additional unrelated operations to increase complexity
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int i = 1; i <= 5; i++) {
                numbers.add(i * 10);
            }

            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            System.out.println("Sum of numbers: " + sum);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}