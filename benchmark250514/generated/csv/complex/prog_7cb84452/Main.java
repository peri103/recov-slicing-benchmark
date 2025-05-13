import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import org.apache.commons.csv.CSVParser;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // CSV data setup
        String csvData = "name,age\nJohn,30\nDoe,25";
        Reader in = new StringReader(csvData);
        CSVFormat format = CSVFormat.DEFAULT;
        
        // Initialize a map for storing header information
        Map<String, Integer> headerMap = new HashMap<>();
        
        // Apply the write method
        /* write */ format = format.withFirstRecordAsHeader();
        
        try {
            // Parse the CSV data
            CSVParser parser = new CSVParser(in, format);
            
            // Store headers in the map
            headerMap = parser.getHeaderMap();
            
            // Print header information
            for (Map.Entry<String, Integer> entry : headerMap.entrySet()) {
                System.out.println("Header: " + entry.getKey() + ", Index: " + entry.getValue());
            }
            
            // Process each record
            for (CSVRecord record : parser) {
                // Perform some unrelated operations
                String name = record.get("name");
                int age = Integer.parseInt(record.get("age"));
                System.out.println("Name: " + name + ", Age: " + age);
                
                // Apply the read method
                /* read */ boolean isMapped = record.isMapped("name");
                System.out.println("Is 'name' mapped: " + isMapped);
                
                // Additional unrelated operations
                int calculatedValue = age * 2;
                System.out.println("Calculated Value: " + calculatedValue);
                
                break; // Ensure the read method is executed only once
            }
            
            // More complex operations with unrelated data structures
            Map<String, Integer> additionalData = new HashMap<>();
            additionalData.put("Alice", 28);
            additionalData.put("Bob", 32);
            
            for (Map.Entry<String, Integer> entry : additionalData.entrySet()) {
                System.out.println("Additional Data - Name: " + entry.getKey() + ", Age: " + entry.getValue());
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}