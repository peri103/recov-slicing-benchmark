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
            // Create a CSVFormat object and set a null string representation
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL");

            // Prepare a CSV input string with a null value
            String csvData = "name,age\nJohn,NULL\nDoe,25";

            // Parse the CSV data using the format with null string
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Additional code to demonstrate complexity
            Map<String, Integer> nameToAgeMap = new HashMap<>();
            for (CSVRecord rec : parser) {
                String name = rec.get("name");
                Integer age = rec.isSet("age") ? Integer.valueOf(rec.get("age")) : null;
                nameToAgeMap.put(name, age);
            }

            // Perform some operations on the map
            int totalAge = 0;
            int count = 0;
            for (Map.Entry<String, Integer> entry : nameToAgeMap.entrySet()) {
                if (entry.getValue() != null) {
                    totalAge += entry.getValue();
                    count++;
                }
            }
            double averageAge = count > 0 ? (double) totalAge / count : 0;
            System.out.println("Average age: " + averageAge);

            // Retrieve the first record
            CSVRecord record = parser.getRecords().get(0);

            // Check if the 'age' field is set (it should be null)
            /* read */ boolean isAgeSet = record.isSet("age");

            // Output the result
            System.out.println("Is 'age' field set? " + isAgeSet);

            // Further operations to increase complexity
            if (isAgeSet) {
                System.out.println("Age is set for the first record.");
            } else {
                System.out.println("Age is not set for the first record.");
            }

            // Print all name-age pairs
            for (String name : nameToAgeMap.keySet()) {
                System.out.println("Name: " + name + ", Age: " + nameToAgeMap.get(name));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}