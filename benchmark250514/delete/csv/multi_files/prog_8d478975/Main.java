import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Sample CSV data
        String csvData = "Name,Age,Location\nJohn,25,USA\nDoe,30,UK";

        // Initialize CSVHandler to parse the CSV data
        CSVHandler csvHandler = new CSVHandler(csvData);
        List<CSVRecord> records = csvHandler.getRecords();

        // Additional unrelated code to increase complexity
        Map<String, Integer> nameToAgeMap = new HashMap<>();
        for (CSVRecord rec : records) {
            String name = rec.get("Name");
            int age = Integer.parseInt(rec.get("Age"));
            nameToAgeMap.put(name, age);
        }

        // Print the map
        System.out.println("Name to Age Map: " + nameToAgeMap);

        // Further operations using the map
        int totalAge = 0;
        for (int age : nameToAgeMap.values()) {
            totalAge += age;
        }
        System.out.println("Total age: " + totalAge);

        // Using CSVRecordChecker to check if the "Name" column is mapped
        CSVRecordChecker checker = new CSVRecordChecker(records.get(0));
        boolean isNameMapped = checker.isNameMapped();

        // Output the result
        System.out.println("Is 'Name' column mapped? " + isNameMapped);

        // Another unrelated operation
        Map<String, String> locationMap = new HashMap<>();
        for (CSVRecord rec : records) {
            String name = rec.get("Name");
            String location = rec.get("Location");
            locationMap.put(name, location);
        }
        
        // Print the location map
        System.out.println("Name to Location Map: " + locationMap);
    }
}