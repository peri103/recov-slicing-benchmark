import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with headers
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withHeader("Name", "Age", "Country");

            // Sample CSV data
            String csvData = "Name,Age,Country\nJohn,30,USA\nJane,25,Canada";

            // Parse the CSV data
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();

            // Additional logic to process CSV data
            Map<String, Integer> ageMap = new HashMap<>();
            for (CSVRecord rec : records) {
                String name = rec.get("Name");
                int age = Integer.parseInt(rec.get("Age"));
                ageMap.put(name, age);
            }

            // Simulate some complex operations
            int totalAge = 0;
            for (Integer age : ageMap.values()) {
                totalAge += age;
            }
            System.out.println("Total Age: " + totalAge);

            // Read from the first record
            CSVRecord record = records.get(0);
            /* read */ boolean isSet = record.isSet("Name");

            // Output the result
            System.out.println("Is 'Name' set in the first record? " + isSet);

            // Additional unrelated logic
            int maxAge = 0;
            for (Integer age : ageMap.values()) {
                if (age > maxAge) {
                    maxAge = age;
                }
            }
            System.out.println("Max Age: " + maxAge);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}