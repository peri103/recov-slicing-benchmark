import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with escape character
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withEscape('\\');
            
            // Prepare a CSV string to parse
            String csvData = "name,age\nJohn\\, Doe,30\nJane\\, Smith,25";
            
            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            
            // Additional processing: create a map of names to ages
            Map<String, Integer> nameAgeMap = new HashMap<>();
            for (CSVRecord rec : parser) {
                String name = rec.get(0);
                int age = Integer.parseInt(rec.get(1));
                nameAgeMap.put(name, age);
            }
            
            // Perform some operations on the map
            int totalAge = 0;
            for (Map.Entry<String, Integer> entry : nameAgeMap.entrySet()) {
                totalAge += entry.getValue();
            }
            System.out.println("Total Age: " + totalAge);
            
            // Retrieve a specific record
            CSVRecord record = parser.getRecords().get(0);
            
            // Read the record as a string
            /* read */ String recordString = record.toString();
            
            // Print the record string
            System.out.println("Record: " + recordString);
            
            // More complex operations: print names in uppercase
            for (String name : nameAgeMap.keySet()) {
                System.out.println("Name: " + name.toUpperCase());
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}