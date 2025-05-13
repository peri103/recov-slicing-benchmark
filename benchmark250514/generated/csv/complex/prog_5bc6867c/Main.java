import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with the desired configuration
        CSVFormat csvFormat = CSVFormat.DEFAULT;

        // Use the write method to configure CSVFormat
        /* write */ csvFormat = csvFormat.withIgnoreHeaderCase();

        // Sample CSV data
        String csvData = "Name, Age\nJohn Doe, 30\nJane Smith, 25";

        try {
            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), csvFormat);

            // Map to store the CSV records
            Map<String, Integer> nameToAgeMap = new HashMap<>();

            for (CSVRecord record : parser) {
                // Use the read method to check if a header is mapped
                /* read */ boolean isMapped = record.isMapped("Name");
                System.out.println("Is 'Name' mapped: " + isMapped);

                // Additional logic: populate the map with names and ages
                if (isMapped) {
                    String name = record.get("Name");
                    int age = Integer.parseInt(record.get("Age"));
                    nameToAgeMap.put(name, age);
                }
            }

            // Additional logic: print the map
            System.out.println("Name to Age Map: " + nameToAgeMap);

            // Additional logic: calculate average age
            int totalAge = 0;
            for (int age : nameToAgeMap.values()) {
                totalAge += age;
            }
            double averageAge = totalAge / (double) nameToAgeMap.size();
            System.out.println("Average Age: " + averageAge);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}