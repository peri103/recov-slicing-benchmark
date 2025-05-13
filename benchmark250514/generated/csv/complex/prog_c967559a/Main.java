import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSV format instance with ignoring header case
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withIgnoreHeaderCase(true);

            // Sample CSV data
            String csvData = "Name, Age, Country\nJohn Doe, 30, USA\nJane Doe, 25, Canada";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Additional code to make the program more complex
            Map<String, Integer> ageMap = new HashMap<>();
            for (CSVRecord rec : parser) {
                String name = rec.get("Name");
                int age = Integer.parseInt(rec.get("Age"));
                ageMap.put(name, age);
            }

            // Perform some operations with the map
            int totalAge = 0;
            for (Integer age : ageMap.values()) {
                totalAge += age;
            }
            System.out.println("Total age: " + totalAge);

            // Get the first record
            CSVRecord record = parser.getRecords().get(0);

            // Check if the record is mapped
            /* read */ boolean isMapped = record.isMapped("name");
            System.out.println("Is 'name' mapped: " + isMapped);

            // More complex operations
            String country = record.get("Country");
            System.out.println("Country: " + country);

            // Calculate average age
            double averageAge = totalAge / ageMap.size();
            System.out.println("Average age: " + averageAge);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}