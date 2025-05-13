import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Sample CSV data
        String csvData = "Name,Age,Location\nJohn,25,USA\nDoe,30,UK";

        try {
            // Initialize CSVFormat with header
            /* write */ CSVFormat csvFormat = CSVFormat.DEFAULT.withFirstRecordAsHeader();

            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), csvFormat);

            // Additional unrelated code to increase complexity
            Map<String, Integer> nameToAgeMap = new HashMap<>();
            for (CSVRecord rec : parser) {
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

            // Reset the parser to read records again
            parser = new CSVParser(new StringReader(csvData), csvFormat);

            // Read the first record
            CSVRecord record = parser.getRecords().get(0);

            // Check if a column is mapped
            /* read */ boolean isNameMapped = record.isMapped("Name");

            // Output the result
            System.out.println("Is 'Name' column mapped? " + isNameMapped);

            // Another unrelated operation
            Map<String, String> locationMap = new HashMap<>();
            for (CSVRecord rec : parser) {
                String name = rec.get("Name");
                String location = rec.get("Location");
                locationMap.put(name, location);
            }
            
            // Print the location map
            System.out.println("Name to Location Map: " + locationMap);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}