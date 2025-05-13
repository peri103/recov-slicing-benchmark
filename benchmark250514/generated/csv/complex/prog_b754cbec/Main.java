import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with the write method
            /* write */ CSVFormat csvFormat = CSVFormat.DEFAULT.withIgnoreEmptyLines(true);

            // Sample CSV data
            String csvData = "name,age,city\nJohn,30,New York\nJane,25,Los Angeles";

            // Parse the CSV data using the configured CSVFormat
            CSVParser parser = CSVParser.parse(new StringReader(csvData), csvFormat);

            // Get all records
            ArrayList<CSVRecord> records = new ArrayList<>(parser.getRecords());

            // Create a map to store age by name
            Map<String, Integer> ageByName = new HashMap<>();

            // Populate the map with data from CSV
            for (CSVRecord record : records) {
                String name = record.get("name");
                int age = Integer.parseInt(record.get("age"));
                ageByName.put(name, age);
            }

            // Check if the 'name' field is set using the read method
            CSVRecord firstRecord = records.get(0);
            /* read */ boolean isSet = firstRecord.isSet("name");

            // Output the result
            System.out.println("Is 'name' field set? " + isSet);

            // Print the ages stored in the map
            for (Map.Entry<String, Integer> entry : ageByName.entrySet()) {
                System.out.println(entry.getKey() + " is " + entry.getValue() + " years old.");
            }

            // Additional logic: Calculate and print the average age
            int totalAge = 0;
            for (int age : ageByName.values()) {
                totalAge += age;
            }
            double averageAge = totalAge / (double) ageByName.size();
            System.out.println("Average age: " + averageAge);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}