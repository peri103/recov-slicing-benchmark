import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSVFormat instance with the specified write method
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces();

            // Prepare a sample CSV data
            String csvData = "Name, Age, City\nJohn Doe, 30, New York\nJane Smith, 25, Los Angeles";

            // Parse the CSV data
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();

            // Create a map to store parsed data
            Map<String, Integer> ageMap = new HashMap<>();

            // Process each record and store the name-age pair in the map
            for (CSVRecord record : records) {
                String name = record.get("Name");
                int age = Integer.parseInt(record.get("Age"));
                ageMap.put(name, age);
            }

            // Perform some operations on the map
            System.out.println("Age map: " + ageMap);

            // Calculate the average age
            int totalAge = 0;
            for (int age : ageMap.values()) {
                totalAge += age;
            }
            double averageAge = totalAge / (double) ageMap.size();
            System.out.println("Average age: " + averageAge);

            // Read the first record and check consistency using the specified read method
            CSVRecord firstRecord = records.get(0);
            /* read */ boolean isConsistent = firstRecord.isConsistent();

            // Print the result of the read operation
            System.out.println("Is the first record consistent? " + isConsistent);

            // Additional operations
            int maxAge = Integer.MIN_VALUE;
            String oldestPerson = "";
            for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
                if (entry.getValue() > maxAge) {
                    maxAge = entry.getValue();
                    oldestPerson = entry.getKey();
                }
            }
            System.out.println("Oldest person: " + oldestPerson + " with age " + maxAge);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}