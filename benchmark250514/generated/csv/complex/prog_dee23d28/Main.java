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
            // Initialize CSVFormat with a custom delimiter
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withDelimiter(';');

            // Sample CSV data
            String csvData = "name;age;city\nJohn Doe;30;New York\nJane Smith;25;Los Angeles";

            // Parse the CSV data using the defined format
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Create a map to store the records with name as key
            Map<String, CSVRecord> recordMap = new HashMap<>();
            for (CSVRecord rec : parser.getRecords()) {
                String name = rec.get(0);
                recordMap.put(name, rec);
            }

            // Perform some operations on the map
            if (recordMap.containsKey("Jane Smith")) {
                CSVRecord janeRecord = recordMap.get("Jane Smith");
                System.out.println("Jane's age: " + janeRecord.get(1));
            }

            // Retrieve the first record
            CSVRecord record = parser.getRecords().get(0);

            // Perform some unrelated operations
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
            }
            System.out.println("Sum of numbers from 0 to 9: " + sum);

            // Read the record as a string
            /* read */ String recordString = record.toString();

            // Print the record
            System.out.println(recordString);

            // Perform more complex operations
            Map<String, Integer> cityPopulation = new HashMap<>();
            cityPopulation.put("New York", 8000000);
            cityPopulation.put("Los Angeles", 4000000);
            cityPopulation.put("Chicago", 2700000);

            int totalPopulation = 0;
            for (Integer population : cityPopulation.values()) {
                totalPopulation += population;
            }
            System.out.println("Total population of cities: " + totalPopulation);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}