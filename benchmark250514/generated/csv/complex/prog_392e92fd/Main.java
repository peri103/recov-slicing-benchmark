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
            // Initialize the CSVFormat with a null string
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL");

            // Sample CSV data
            String csvData = "name,age,city\nJohn,30,NULL\nDoe,NULL,New York";

            // Parse the CSV data using the format
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Unrelated complex operations
            Map<String, String> cityMap = new HashMap<>();
            cityMap.put("John", "Unknown");
            cityMap.put("Doe", "New York");
            
            for (CSVRecord record : parser.getRecords()) {
                String name = record.get("name");
                String city = cityMap.get(name);
                System.out.println(name + " lives in " + city);
            }

            // Read the first record
            CSVRecord record = parser.getRecords().get(0);

            // Check if the 'age' field is set
            /* read */ boolean isAgeSet = record.isSet("age");

            // Output the result
            System.out.println("Is 'age' field set in the first record? " + isAgeSet);

            // Additional unrelated operations
            int sum = 0;
            for (int i = 1; i <= 10; i++) {
                sum += i;
            }
            System.out.println("Sum of numbers from 1 to 10: " + sum);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}