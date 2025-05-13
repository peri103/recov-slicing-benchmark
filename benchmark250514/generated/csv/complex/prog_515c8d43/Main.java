import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with trim option
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withTrim();

            // Prepare a sample CSV input
            String csvData = "Name, Age\nJohn Doe, 29\nJane Smith, 34";
            StringReader reader = new StringReader(csvData);

            // Parse the CSV data
            CSVParser parser = new CSVParser(reader, format);

            // Add complexity: Calculate average age from CSV records
            int totalAge = 0;
            int count = 0;
            for (CSVRecord record : parser) {
                String ageStr = record.get("Age");
                totalAge += Integer.parseInt(ageStr.trim());
                count++;
            }
            double averageAge = (double) totalAge / count;
            System.out.println("Average Age: " + averageAge);

            // Add complexity: Store names in a map
            Map<String, Integer> nameAgeMap = new HashMap<>();
            for (CSVRecord record : parser.getRecords()) {
                String name = record.get("Name").trim();
                int age = Integer.parseInt(record.get("Age").trim());
                nameAgeMap.put(name, age);
            }

            // Check if a column is mapped
            CSVRecord firstRecord = parser.getRecords().get(0);
            /* read */ boolean isMapped = firstRecord.isMapped("Name");
            System.out.println("Is 'Name' mapped: " + isMapped);

            // Print names and ages from map
            for (Map.Entry<String, Integer> entry : nameAgeMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}