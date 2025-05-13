import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.StringReader;
import java.io.IOException;
import java.util.List;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with trim option
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withTrim();

            // Sample CSV data
            String csvData = "name, age, location\nJohn Doe, 30, New York\nJane Doe, 25, Los Angeles";

            // Parse the CSV data
            CSVParser parser = format.parse(new StringReader(csvData));
            List<CSVRecord> records = parser.getRecords();

            // Initialize a map to store parsed data
            HashMap<String, Integer> ageMap = new HashMap<>();

            // Process each record and store age in the map
            for (CSVRecord record : records) {
                String name = record.get("name");
                int age = Integer.parseInt(record.get("age"));
                ageMap.put(name, age);
            }

            // Perform some unrelated operations
            int sumOfAges = 0;
            for (Integer age : ageMap.values()) {
                sumOfAges += age;
            }
            System.out.println("Sum of ages: " + sumOfAges);

            // Read the first record
            CSVRecord firstRecord = records.get(0);

            // Check if a column is mapped
            /* read */ boolean isMapped = firstRecord.isMapped("name");

            // Output the result
            System.out.println("Is 'name' column mapped: " + isMapped);

            // Additional processing
            int averageAge = sumOfAges / ageMap.size();
            System.out.println("Average age: " + averageAge);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}