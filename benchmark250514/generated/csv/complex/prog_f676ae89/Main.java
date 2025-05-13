import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.StringReader;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Define the CSV format with headers
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withHeader("Name", "Age", "Country");
            
            // Sample CSV data
            String csvData = "Name,Age,Country\nJohn,30,USA\nJane,25,UK\nDoe,40,Canada";
            
            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();
            
            // Initialize a map to store ages by name
            Map<String, Integer> ageMap = new HashMap<>();
            
            // Process each record and populate the map
            for (CSVRecord record : records) {
                String name = record.get("Name");
                int age = Integer.parseInt(record.get("Age"));
                ageMap.put(name, age);
            }
            
            // Unrelated code: Calculate average age
            int totalAge = 0;
            for (int age : ageMap.values()) {
                totalAge += age;
            }
            double averageAge = totalAge / (double) ageMap.size();
            
            // Print average age
            System.out.println("Average age: " + averageAge);
            
            // More CSV processing: Check if a column is set for a specific record
            CSVRecord firstRecord = records.get(0);
            /* read */ boolean isNameSet = firstRecord.isSet("Name");
            
            // Output the result
            System.out.println("Is 'Name' header set in first record? " + isNameSet);
            
            // Unrelated code: Print all names
            System.out.println("Names in the CSV:");
            for (String name : ageMap.keySet()) {
                System.out.println(name);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}