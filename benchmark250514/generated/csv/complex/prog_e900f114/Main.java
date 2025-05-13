import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.StringReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Prepare the CSV data
            String csvData = "name, age, city\nJohn Doe, 30, New York";

            // Create a CSVFormat instance and configure it
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withIgnoreSurroundingSpaces(true);

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Retrieve the first record
            CSVRecord record = parser.getRecords().get(0);

            // Additional CSV parsing logic
            CSVRecord secondRecord = parser.getRecords().get(0);
            boolean isAgeSet = secondRecord.isSet("age");
            System.out.println("Is 'age' set? " + isAgeSet);

            // Simulate some unrelated complex logic
            Map<String, Integer> nameToAgeMap = new HashMap<>();
            nameToAgeMap.put("John Doe", 30);

            for (Map.Entry<String, Integer> entry : nameToAgeMap.entrySet()) {
                System.out.println("Name: " + entry.getKey() + ", Age: " + entry.getValue());
            }

            // Check if a specific column is set
            /* read */ boolean isNameSet = record.isSet("name");

            // More complex operations with maps
            Map<String, String> cityToCountryMap = new HashMap<>();
            cityToCountryMap.put("New York", "USA");
            cityToCountryMap.put("London", "UK");

            for (String city : cityToCountryMap.keySet()) {
                System.out.println("City: " + city + ", Country: " + cityToCountryMap.get(city));
            }

            // Print the result
            System.out.println("Is 'name' set? " + isNameSet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}