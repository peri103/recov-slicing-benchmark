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
            // Initialize the CSV format
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withIgnoreEmptyLines(true);

            // Prepare a CSV input for parsing
            String csvData = "Name, Age, City\nJohn Doe, 29, New York\n\nJane Doe, 25, Los Angeles";
            CSVParser parser = new CSVParser(new StringReader(csvData), format);

            // Process each record
            Map<String, Integer> nameToAgeMap = new HashMap<>();
            for (CSVRecord record : parser) {
                String name = record.get("Name");
                int age = Integer.parseInt(record.get("Age"));
                nameToAgeMap.put(name, age);
            }

            // Additional processing: Calculate average age
            int totalAge = 0;
            for (int age : nameToAgeMap.values()) {
                totalAge += age;
            }
            double averageAge = (double) totalAge / nameToAgeMap.size();
            System.out.println("Average Age: " + averageAge);

            // Check if a specific field is set
            for (CSVRecord record : parser) {
                /* read */ boolean isSet = record.isSet("Name");
                System.out.println("Is 'Name' set: " + isSet);
            }

            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}