import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize the data and CSV format
        String csvData = "Name,Age,Location\nJohn,30,USA\nDoe,25,Canada";
        CSVFormat format = CSVFormat.DEFAULT.withFirstRecordAsHeader(); // /* write */

        // Create a map to store records
        Map<String, Integer> ageMap = new HashMap<>();

        try {
            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            
            // Process each record
            for (CSVRecord record : parser) {
                String name = record.get("Name");
                int age = Integer.parseInt(record.get("Age"));
                ageMap.put(name, age); // Store name and age in map

                // Additional processing
                if (age > 28) {
                    System.out.println(name + " is older than 28.");
                }
            }

            // Retrieve and print age from map
            for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
                System.out.println(entry.getKey() + " is " + entry.getValue() + " years old.");
            }

            // Check if a header is mapped
            CSVRecord firstRecord = parser.getRecords().get(0); // Get the first record
            boolean isMapped = firstRecord.isMapped("Name"); // /* read */
            System.out.println("Is 'Name' header mapped: " + isMapped);

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Additional unrelated code for complexity
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);
    }
}