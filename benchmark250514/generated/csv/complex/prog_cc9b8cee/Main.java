import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with the write method
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withAllowMissingColumnNames(true);

            // Create a sample CSV string
            String csvData = "name,age\nAlice,30\nBob,25";

            // Parse the CSV string using the format
            List<CSVRecord> records = format.parse(new java.io.StringReader(csvData)).getRecords();

            // Initialize a map to store name and age
            Map<String, Integer> nameAgeMap = new HashMap<>();

            // Populate the map with data from CSV records
            for (CSVRecord record : records) {
                String name = record.get("name");
                int age = Integer.parseInt(record.get("age"));
                nameAgeMap.put(name, age);
            }

            // Perform some operations on the map
            int totalAge = 0;
            for (Integer age : nameAgeMap.values()) {
                totalAge += age;
            }
            System.out.println("Total age: " + totalAge);

            // Use the read method on a CSVRecord
            CSVRecord record = records.get(0);
            /* read */ boolean isConsistent = record.isConsistent();

            // Output the result
            System.out.println("Is the record consistent? " + isConsistent);

            // Additional complexity: calculate average age
            double averageAge = totalAge / (double) nameAgeMap.size();
            System.out.println("Average age: " + averageAge);

            // Additional complexity: find the oldest person
            String oldestPerson = null;
            int maxAge = Integer.MIN_VALUE;
            for (Map.Entry<String, Integer> entry : nameAgeMap.entrySet()) {
                if (entry.getValue() > maxAge) {
                    maxAge = entry.getValue();
                    oldestPerson = entry.getKey();
                }
            }
            System.out.println("Oldest person: " + oldestPerson);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}