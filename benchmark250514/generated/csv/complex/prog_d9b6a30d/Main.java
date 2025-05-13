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
            // Initialize the CSVFormat with the write method
            CSVFormat format = CSVFormat.DEFAULT /* write */.withIgnoreSurroundingSpaces(true);

            // Sample CSV data
            String csvData = "name,age\nJohn Doe, 30\nJane Doe, 25";

            // Parse the CSV data using the format
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Create a map to store the CSV data
            Map<String, Integer> ageMap = new HashMap<>();

            // Iterate over the records and fill the map
            for (CSVRecord rec : parser) {
                String name = rec.get("name");
                int age = Integer.parseInt(rec.get("age"));
                ageMap.put(name, age);
            }

            // Perform some operations on the map
            int totalAge = 0;
            for (Integer age : ageMap.values()) {
                totalAge += age;
            }

            System.out.println("Total age: " + totalAge);

            // Get the first record
            CSVRecord record = parser.getRecords().get(0);

            // Use the read method to check if a field is set
            /* read */ boolean isNameSet = record.isSet("name");

            // Output the result
            System.out.println("Is 'name' set in the first record: " + isNameSet);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}