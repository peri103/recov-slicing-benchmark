import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Sample CSV data
        String csvData = "Name, Age, Location\nJohn Doe, 29, USA\nJane Smith, 34, UK";
        
        // Initialize CSVFormat with ignoring header case
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withIgnoreHeaderCase();
        
        // Parse CSV data
        List<CSVRecord> records = new ArrayList<>();
        try {
            records = format.parse(new StringReader(csvData)).getRecords();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        // Additional unrelated complex code
        HashMap<String, Integer> ageMap = new HashMap<>();
        for (CSVRecord rec : records) {
            String name = rec.get("Name");
            int age = Integer.parseInt(rec.get("Age"));
            ageMap.put(name, age);
        }
        
        // Process the ageMap
        int totalAge = 0;
        for (String name : ageMap.keySet()) {
            totalAge += ageMap.get(name);
        }
        double averageAge = (double) totalAge / ageMap.size();
        System.out.println("Average Age: " + averageAge);
        
        // Read the first record and check if a column is mapped
        CSVRecord record = records.get(0);
        /* read */ boolean isMapped = record.isMapped("name");
        
        // Output the result
        System.out.println("Is 'name' mapped: " + isMapped);
        
        // More unrelated complex code
        ArrayList<String> locations = new ArrayList<>();
        for (CSVRecord rec : records) {
            locations.add(rec.get("Location"));
        }
        
        // Print all locations
        for (String location : locations) {
            System.out.println("Location: " + location);
        }
    }
}