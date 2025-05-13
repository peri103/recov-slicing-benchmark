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
            // Create a CSV format with a null string representation
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withNullString("NULL");

            // Sample CSV data
            String csvData = "name,age\nJohn,30\nAlice,NULL";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Create a map to store names and ages
            Map<String, Integer> nameAgeMap = new HashMap<>();

            // Iterate over the records
            for (CSVRecord record : parser) {
                // Check if the 'age' field is set
                /* read */ boolean isAgeSet = record.isSet("age");

                // Get the name
                String name = record.get("name");

                // If age is set, add to map, otherwise set age as -1
                int age = isAgeSet ? Integer.parseInt(record.get("age")) : -1;
                nameAgeMap.put(name, age);
            }

            // Print the map
            System.out.println("Name-Age Map:");
            for (Map.Entry<String, Integer> entry : nameAgeMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

            // Additional complex operations
            int sumOfAges = 0;
            for (Integer age : nameAgeMap.values()) {
                if (age > 0) {
                    sumOfAges += age;
                }
            }
            System.out.println("Sum of ages (excluding -1): " + sumOfAges);

            // Check if any age is -1
            boolean hasNullAge = nameAgeMap.containsValue(-1);
            System.out.println("Contains NULL age: " + hasNullAge);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}