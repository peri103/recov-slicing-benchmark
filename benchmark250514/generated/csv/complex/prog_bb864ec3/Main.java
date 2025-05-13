import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with trim enabled
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withTrim();

            // Sample CSV data
            String csvData = "Name, Age\nJohn Doe, 30\nJane Smith, 25";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();

            // Complex operations with HashMap
            Map<String, Integer> nameToAgeMap = new HashMap<>();
            for (CSVRecord record : records) {
                String name = record.get("Name");
                int age = Integer.parseInt(record.get("Age"));
                nameToAgeMap.put(name, age);
            }

            // Perform calculations
            int totalAge = 0;
            for (Integer age : nameToAgeMap.values()) {
                totalAge += age;
            }
            double averageAge = totalAge / (double) nameToAgeMap.size();
            System.out.println("Average Age: " + averageAge);

            // Access the first record
            CSVRecord record = records.get(0);

            // Check if a mapping for a column exists
            /* read */ boolean isMapped = record.isMapped("Name");
            System.out.println("Is 'Name' mapped: " + isMapped);

            // Additional operations
            if (isMapped) {
                System.out.println("Mapped names:");
                for (String name : nameToAgeMap.keySet()) {
                    System.out.println(name);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}