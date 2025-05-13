import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a null string representation
            CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL");

            // Create a sample CSV input
            String csvData = "name,age\nJohn,NULL\nDoe,25";
            
            // Parse the CSV data using the format
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Retrieve records
            List<CSVRecord> records = parser.getRecords();

            // Access a specific record
            CSVRecord record = records.get(0); // First record: "John,NULL"

            // Initialize a map to store information about each record
            Map<String, Integer> nameToAgeMap = new HashMap<>();

            // Iterate over records to populate the map
            for (CSVRecord rec : records) {
                String name = rec.get("name");
                String ageStr = rec.get("age");
                Integer age = ageStr.equals("NULL") ? null : Integer.parseInt(ageStr);
                nameToAgeMap.put(name, age);
            }

            // Perform some operations on the map
            for (Map.Entry<String, Integer> entry : nameToAgeMap.entrySet()) {
                System.out.println("Name: " + entry.getKey() + ", Age: " + (entry.getValue() == null ? "Unknown" : entry.getValue()));
            }

            // Check if the 'age' column is set (should be false for NULL)
            /* read */ boolean isAgeSet = record.isSet("age");

            // Print the result
            System.out.println("Is 'age' set for the first record: " + isAgeSet);

            // Perform additional operations to make the program more complex
            int sumOfAges = 0;
            for (Integer age : nameToAgeMap.values()) {
                if (age != null) {
                    sumOfAges += age;
                }
            }
            System.out.println("Sum of ages (excluding NULL): " + sumOfAges);

            // Further manipulation of the map
            nameToAgeMap.put("Alice", 30);
            nameToAgeMap.remove("John");

            // Print updated map
            for (Map.Entry<String, Integer> entry : nameToAgeMap.entrySet()) {
                System.out.println("Updated Name: " + entry.getKey() + ", Age: " + (entry.getValue() == null ? "Unknown" : entry.getValue()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}