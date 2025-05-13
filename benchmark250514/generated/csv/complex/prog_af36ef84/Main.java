import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Define CSV content
            String csvData = "Name,Age,Location\nJohn,30,New York\nJane,25,San Francisco";
            
            // Create CSVFormat with header
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withHeader("Name", "Age", "Location");
            
            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();
            
            // Additional data structure for complexity
            HashMap<String, Integer> ageMap = new HashMap<>();
            ArrayList<String> locations = new ArrayList<>();
            
            // Populate additional data structures
            for (CSVRecord record : records) {
                String name = record.get("Name");
                int age = Integer.parseInt(record.get("Age"));
                String location = record.get("Location");
                
                ageMap.put(name, age);
                locations.add(location);
            }
            
            // Perform additional operations
            for (String location : locations) {
                System.out.println("Location: " + location);
            }
            
            // Read the first record and check if a header is set
            CSVRecord record = records.get(0);
            /* read */ boolean isSet = record.isSet("Name");
            
            // Print the result
            System.out.println("Is 'Name' header set in the first record? " + isSet);
            
            // More operations
            for (String name : ageMap.keySet()) {
                System.out.println(name + " is " + ageMap.get(name) + " years old.");
            }
            
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}