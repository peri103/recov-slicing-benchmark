import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.List;
import java.io.StringReader;
import org.apache.commons.csv.CSVParser;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with the write method
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withIgnoreSurroundingSpaces(true);

            // Sample CSV data
            String csvData = "Name, Age\nJohn Doe, 30\nJane Smith, 25";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Additional code to make the program more complex
            // Create a HashMap to store CSV data
            Map<String, Integer> nameToAgeMap = new HashMap<>();

            // Get records
            List<CSVRecord> records = parser.getRecords();

            // Populate the HashMap with data from CSV records
            for (CSVRecord record : records) {
                String name = record.get("Name");
                int age = Integer.parseInt(record.get("Age"));
                nameToAgeMap.put(name, age);
            }

            // Access and print data from the HashMap
            for (Map.Entry<String, Integer> entry : nameToAgeMap.entrySet()) {
                System.out.println("Name: " + entry.getKey() + ", Age: " + entry.getValue());
            }

            // Perform a complex calculation using the ages
            int totalAge = 0;
            for (int age : nameToAgeMap.values()) {
                totalAge += age;
            }
            double averageAge = totalAge / (double) nameToAgeMap.size();
            System.out.println("Average Age: " + averageAge);

            // Read from the first record using the read method
            /* read */ boolean isConsistent = records.get(0).isConsistent();
            System.out.println("Is first record consistent? " + isConsistent);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}