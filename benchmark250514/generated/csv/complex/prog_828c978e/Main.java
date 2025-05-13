import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String csvData = "Name,Age,Location\nJohn,30,New York\nJane,25,Los Angeles";
        
        try {
            // Create a CSVFormat object with the first record as header
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withFirstRecordAsHeader();
            
            // Parse the CSV data using the format
            CSVParser parser = new CSVParser(new StringReader(csvData), format);
            
            // Retrieve the records
            List<CSVRecord> records = parser.getRecords();
            
            // Create a map to store name and age pairs
            Map<String, Integer> nameAgeMap = new HashMap<>();
            
            // Populate the map with data from CSV records
            for (CSVRecord record : records) {
                String name = record.get("Name");
                int age = Integer.parseInt(record.get("Age"));
                nameAgeMap.put(name, age);
            }
            
            // Output the map
            System.out.println("Name-Age Map: " + nameAgeMap);
            
            // Perform some calculations based on the map
            int totalAge = 0;
            for (int age : nameAgeMap.values()) {
                totalAge += age;
            }
            
            double averageAge = totalAge / (double) nameAgeMap.size();
            System.out.println("Average Age: " + averageAge);
            
            // Get the first record
            CSVRecord record = records.get(0);
            
            // Check if the 'Name' field is mapped
            /* read */ boolean isMapped = record.isMapped("Name");
            
            // Output the result
            System.out.println("Is 'Name' field mapped? " + isMapped);
            
            // Close the parser
            parser.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}