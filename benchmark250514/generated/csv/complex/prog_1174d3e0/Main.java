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
            // Initialize CSVFormat with header
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withHeader("Name", "Age", "Country");

            // Create a sample CSV data
            String csvData = "Name,Age,Country\nJohn,30,USA\nAlice,25,UK";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Get the first record
            CSVRecord record = parser.getRecords().get(0);

            // Unrelated complex logic
            Map<String, Integer> ageMap = new HashMap<>();
            for (CSVRecord rec : parser) {
                String name = rec.get("Name");
                int age = Integer.parseInt(rec.get("Age"));
                ageMap.put(name, age);
            }

            // More unrelated logic
            int totalAge = 0;
            for (Integer age : ageMap.values()) {
                totalAge += age;
            }
            System.out.println("Total Age: " + totalAge);

            // Check if "Age" column is set in the record
            /* read */ boolean isAgeSet = record.isSet("Age");

            // Print the result
            System.out.println("Is 'Age' set in the record? " + isAgeSet);

            // Additional logic to use the ageMap
            for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
                System.out.println("Name: " + entry.getKey() + ", Age: " + entry.getValue());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}