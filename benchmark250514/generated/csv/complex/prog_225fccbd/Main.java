import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withFirstRecordAsHeader();
            
            // Sample CSV data
            String csvData = "Name,Age,Location\nJohn,30,USA\nJane,25,UK";
            
            // Parse CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();
            
            // Complex operation: Build a map of names and their corresponding ages
            Map<String, Integer> nameAgeMap = new HashMap<>();
            for (CSVRecord record : records) {
                String name = record.get("Name");
                int age = Integer.parseInt(record.get("Age"));
                nameAgeMap.put(name, age);
            }
            
            // Perform some operations on the map
            int totalAge = 0;
            for (Map.Entry<String, Integer> entry : nameAgeMap.entrySet()) {
                totalAge += entry.getValue();
                System.out.println("Name: " + entry.getKey() + ", Age: " + entry.getValue());
            }
            System.out.println("Total Age: " + totalAge);
            
            // Read from the first record
            CSVRecord record = records.get(0);
            String location = record.get("Location");
            System.out.println("Location of first record: " + location);
            
            // More complex operations
            int maxAge = Integer.MIN_VALUE;
            String oldestPerson = "";
            for (Map.Entry<String, Integer> entry : nameAgeMap.entrySet()) {
                if (entry.getValue() > maxAge) {
                    maxAge = entry.getValue();
                    oldestPerson = entry.getKey();
                }
            }
            System.out.println("Oldest person: " + oldestPerson + " with age " + maxAge);
            
            // Final read operation
            /* read */ boolean isMapped = record.isMapped("Name");
            System.out.println("Is 'Name' mapped in the first record? " + isMapped);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}