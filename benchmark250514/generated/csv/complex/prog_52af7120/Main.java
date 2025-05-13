import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Sample CSV data
        String csvData = "Name, Age, City\nJohn Doe, 30, New York\nJane Smith, 25, Los Angeles";

        // Create a CSVFormat object with the specified configuration
        CSVFormat csvFormat = CSVFormat.DEFAULT;
        /* write */ csvFormat = csvFormat.withIgnoreSurroundingSpaces();

        // Parse the CSV data using the configured CSVFormat
        try {
            CSVParser parser = CSVParser.parse(new StringReader(csvData), csvFormat);
            HashMap<String, ArrayList<String>> dataMap = new HashMap<>();

            // Process each CSV record
            for (CSVRecord record : parser) {
                // Extract data from each record
                String name = record.get("Name");
                String age = record.get("Age");
                String city = record.get("City");

                // Add data to a map for further processing
                if (!dataMap.containsKey(city)) {
                    dataMap.put(city, new ArrayList<>());
                }
                dataMap.get(city).add(name + " (" + age + ")");

                // Check if a specific column is set in the current record
                /* read */ boolean isSet = record.isSet("Name");
                System.out.println("Is 'Name' column set? " + isSet);
            }

            // Print out the collected data grouped by city
            for (String city : dataMap.keySet()) {
                System.out.println("People in " + city + ": " + dataMap.get(city));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Additional complex operations
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * i);
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of squares: " + sum);

        // Simulate some complex logic
        HashMap<String, Integer> nameToAge = new HashMap<>();
        nameToAge.put("John Doe", 30);
        nameToAge.put("Jane Smith", 25);

        for (String name : nameToAge.keySet()) {
            System.out.println(name + " is " + nameToAge.get(name) + " years old.");
        }
    }
}