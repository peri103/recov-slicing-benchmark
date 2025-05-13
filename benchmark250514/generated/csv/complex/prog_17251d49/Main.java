import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.StringReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with write method
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withAllowMissingColumnNames(true);

            // Sample CSV data
            String csvData = "Name, Age\nJohn, 30\nJane, 25";

            // Parse CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Additional logic to manipulate CSV data
            Map<String, Integer> nameAgeMap = new HashMap<>();
            for (CSVRecord rec : parser) {
                String name = rec.get("Name");
                int age = Integer.parseInt(rec.get("Age"));
                nameAgeMap.put(name, age);
            }

            // Perform some operations on the map
            int totalAge = 0;
            for (Map.Entry<String, Integer> entry : nameAgeMap.entrySet()) {
                totalAge += entry.getValue();
            }
            System.out.println("Total Age: " + totalAge);

            // Read CSVRecord and use the read method
            CSVRecord record = parser.getRecords().get(0);
            /* read */ boolean isConsistent = record.isConsistent();
            
            // Print the result
            System.out.println("Is the first record consistent? " + isConsistent);

            // Additional logic to output the map content
            for (Map.Entry<String, Integer> entry : nameAgeMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}