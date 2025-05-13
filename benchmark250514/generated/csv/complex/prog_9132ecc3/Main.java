import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Define CSV content
            String csvContent = "Name,Age,Location\nJohn,30,USA\n\nJane,25,UK";

            // Create CSVFormat instance with ignoring empty lines
            CSVFormat csvFormat = CSVFormat.DEFAULT
                /* write */ .withIgnoreEmptyLines(true);

            // Parse the CSV content
            CSVParser parser = CSVParser.parse(new StringReader(csvContent), csvFormat);

            // Get the records
            List<CSVRecord> records = parser.getRecords();

            // Initialize a map to store name-age pairs
            Map<String, Integer> nameAgeMap = new HashMap<>();

            // Populate the map with data from CSV records
            for (CSVRecord rec : records) {
                String name = rec.get("Name");
                int age = Integer.parseInt(rec.get("Age"));
                nameAgeMap.put(name, age);
            }

            // Perform some operations on the map
            for (Map.Entry<String, Integer> entry : nameAgeMap.entrySet()) {
                System.out.println("Name: " + entry.getKey() + ", Age: " + entry.getValue());
            }

            // Read the first record
            CSVRecord record = records.get(0);

            // Additional logic to manipulate data
            int ageSum = 0;
            for (CSVRecord rec : records) {
                ageSum += Integer.parseInt(rec.get("Age"));
            }
            System.out.println("Total Age Sum: " + ageSum);

            // Check if a particular column is set
            /* read */ boolean isSet = record.isSet("Name");

            // Output the result
            System.out.println("Is 'Name' set in the first record? " + isSet);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}