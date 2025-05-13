import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Sample CSV data with empty lines
        String csvData = "name,age,city\nJohn,25,New York\n\nJane,30,Los Angeles";

        try {
            // Handle CSV parsing
            CSVHandler csvHandler = new CSVHandler();
            Iterable<CSVRecord> records = csvHandler.parseCSV(csvData);

            // Initialize a map to store names and ages
            Map<String, Integer> nameAgeMap = new HashMap<>();

            // Process the records and fill the map
            for (CSVRecord record : records) {
                String name = record.get("name");
                int age = Integer.parseInt(record.get("age"));
                nameAgeMap.put(name, age);
            }

            // Perform some operations on the map
            for (Map.Entry<String, Integer> entry : nameAgeMap.entrySet()) {
                System.out.println("Name: " + entry.getKey() + ", Age: " + entry.getValue());
            }

            // Read the first record to check if 'name' is set
            CSVReader csvReader = new CSVReader(records);
            boolean isNameSet = csvReader.isFirstRecordNameSet();
            System.out.println("Is 'name' set in the first record? " + isNameSet);

            // Additional complex logic: Calculate average age
            int totalAge = 0;
            for (int age : nameAgeMap.values()) {
                totalAge += age;
            }
            double averageAge = totalAge / (double) nameAgeMap.size();
            System.out.println("Average Age: " + averageAge);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}