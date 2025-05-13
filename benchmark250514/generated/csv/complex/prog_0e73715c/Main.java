import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with the write method
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withAllowMissingColumnNames(true);

            // Prepare a CSV input for parsing
            String csvData = "name,age\nJohn Doe,30\nJane Doe,29";
            StringReader reader = new StringReader(csvData);

            // Parse the CSV data
            CSVParser parser = new CSVParser(reader, format);
            CSVRecord record = parser.getRecords().get(0);

            // Additional code to make the program more complex
            Map<String, Integer> nameAgeMap = new HashMap<>();
            for (CSVRecord rec : parser) {
                String name = rec.get("name");
                int age = Integer.parseInt(rec.get("age"));
                nameAgeMap.put(name, age);
            }

            // Print the map
            System.out.println("Name-Age Map: " + nameAgeMap);

            // Use the read method to check consistency
            /* read */ boolean isConsistent = record.isConsistent();
            System.out.println("Is the record consistent? " + isConsistent);

            // Additional operations on the map
            for (Map.Entry<String, Integer> entry : nameAgeMap.entrySet()) {
                System.out.println("Name: " + entry.getKey() + ", Age: " + entry.getValue());
            }

            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}