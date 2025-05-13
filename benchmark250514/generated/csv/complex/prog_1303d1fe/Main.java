import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a custom delimiter
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withDelimiter(';');

            // Sample CSV data
            String csvData = "Name;Age;City\nJohn Doe;30;New York\nJane Smith;25;Los Angeles";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Initialize a map to store names and ages
            Map<String, Integer> nameAgeMap = new HashMap<>();

            // Iterate over records to populate the map
            for (CSVRecord rec : parser) {
                String name = rec.get(0);
                int age = Integer.parseInt(rec.get(1));
                nameAgeMap.put(name, age);
            }

            // Perform some operations on the map
            int totalAge = 0;
            for (int age : nameAgeMap.values()) {
                totalAge += age;
            }

            System.out.println("Total Age: " + totalAge);

            // Read the first record
            /* read */ CSVRecord record = parser.getRecords().get(0);
            System.out.println(record.toString());

            // Additional logic with the map
            if (nameAgeMap.containsKey("Jane Smith")) {
                System.out.println("Jane Smith's age: " + nameAgeMap.get("Jane Smith"));
            }

            // Further complex operations
            int averageAge = totalAge / nameAgeMap.size();
            System.out.println("Average Age: " + averageAge);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}