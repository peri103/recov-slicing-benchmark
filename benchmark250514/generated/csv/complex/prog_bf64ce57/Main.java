import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with the write method
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withIgnoreSurroundingSpaces();

        // Sample CSV data
        String csvData = "Name, Age\nJohn Doe, 29\nJane Smith, 34";

        try {
            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            // Get the first record
            CSVRecord record = parser.getRecords().get(0);

            // Additional unrelated logic
            Map<String, Integer> ageMap = new HashMap<>();
            for (CSVRecord rec : parser) {
                ageMap.put(rec.get("Name"), Integer.parseInt(rec.get("Age")));
            }
            
            // Calculate average age
            int totalAge = 0;
            for (Integer age : ageMap.values()) {
                totalAge += age;
            }
            double averageAge = totalAge / (double) ageMap.size();
            System.out.println("Average Age: " + averageAge);

            // Use the read method to check if a specific column is set
            /* read */ boolean isSet = record.isSet("Name");
            System.out.println("Is 'Name' set: " + isSet);

            // Print all names from the CSV
            System.out.println("Names in CSV:");
            for (String name : ageMap.keySet()) {
                System.out.println(name);
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}