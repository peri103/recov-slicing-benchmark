import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.util.List;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize the CSVFormat with the escape character
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withEscape('\\');

            // Create a sample CSV input
            String csvInput = "name,age\nJohn,30\nDoe,25";

            // Parse the CSV input
            CSVParser parser = CSVParser.parse(csvInput, format);

            // Create a map to store names and ages
            HashMap<String, Integer> nameAgeMap = new HashMap<>();

            // Get the records
            List<CSVRecord> records = parser.getRecords();

            // Populate the map with the records
            for (CSVRecord record : records) {
                String name = record.get(0);
                int age = Integer.parseInt(record.get(1));
                nameAgeMap.put(name, age);
            }

            // Perform some operations on the map
            for (String name : nameAgeMap.keySet()) {
                System.out.println("Name: " + name + ", Age: " + nameAgeMap.get(name));
            }

            // Read the first record and print its string representation
            /* read */ String recordString = records.get(0).toString();
            System.out.println("First record: " + recordString);

            // Additional logic to manipulate the map
            if (nameAgeMap.containsKey("Doe")) {
                nameAgeMap.put("Doe", nameAgeMap.get("Doe") + 5); // Increment Doe's age by 5
            }

            // Print updated map
            System.out.println("Updated map:");
            for (String name : nameAgeMap.keySet()) {
                System.out.println("Name: " + name + ", Age: " + nameAgeMap.get(name));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}