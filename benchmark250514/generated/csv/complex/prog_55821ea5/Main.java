import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with write method
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withIgnoreSurroundingSpaces(true);

            // Sample CSV data
            String csvData = "name, age\nJohn Doe, 30\nJane Smith, 25";
            StringReader reader = new StringReader(csvData);

            // Parse the CSV data using the format
            Iterable<CSVRecord> records = format.parse(reader);

            // Create a list to store names and ages
            List<String> names = new ArrayList<>();
            List<Integer> ages = new ArrayList<>();

            // Create a map to associate names with ages
            Map<String, Integer> nameAgeMap = new HashMap<>();

            // Process each CSV record
            for (CSVRecord record : records) {
                String name = record.get("name").trim();
                int age = Integer.parseInt(record.get("age").trim());
                names.add(name);
                ages.add(age);
                nameAgeMap.put(name, age);
            }

            // Perform some calculations on ages
            int totalAge = 0;
            for (int age : ages) {
                totalAge += age;
            }
            double averageAge = totalAge / (double) ages.size();
            System.out.println("Average Age: " + averageAge);

            // Read the first record for consistency check
            CSVRecord firstRecord = records.iterator().next();
            
            // Use read method
            /* read */ boolean isConsistent = firstRecord.isConsistent();
            System.out.println("Is the first record consistent? " + isConsistent);

            // Print the name-age map
            for (Map.Entry<String, Integer> entry : nameAgeMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}