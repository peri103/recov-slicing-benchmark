import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with the write method
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withAllowMissingColumnNames();

            // Sample CSV data
            String csvData = "name,age\nJohn,30\nDoe,25";

            // Parse the CSV data using the format
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            
            // Additional logic: Create a map to store CSV records
            Map<String, Integer> nameToAgeMap = new HashMap<>();

            // Iterate over records and populate the map
            for (CSVRecord rec : parser) {
                String name = rec.get("name");
                int age = Integer.parseInt(rec.get("age"));
                nameToAgeMap.put(name, age);
            }

            // Perform some operations on the map
            if (nameToAgeMap.containsKey("John")) {
                int johnAge = nameToAgeMap.get("John");
                System.out.println("John's age: " + johnAge);
            }

            // Get the first record
            CSVRecord record = parser.getRecords().get(0);

            // Use the read method
            /* read */ boolean isSet = record.isSet("name");

            // Output the result
            System.out.println("Is 'name' set in the first record: " + isSet);

            // Additional logic: Print all names and ages
            for (Map.Entry<String, Integer> entry : nameToAgeMap.entrySet()) {
                System.out.println("Name: " + entry.getKey() + ", Age: " + entry.getValue());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}