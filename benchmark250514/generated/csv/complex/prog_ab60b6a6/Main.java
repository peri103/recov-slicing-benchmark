import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat and configure it
            CSVFormat csvFormat = CSVFormat.DEFAULT;
            /* write */ csvFormat = csvFormat.withAllowMissingColumnNames();

            // Sample CSV data
            String csvData = "name,age\nJohn,30\nJane,25";

            // Parse the CSV data using the configured CSVFormat
            List<CSVRecord> records = csvFormat.parse(new StringReader(csvData)).getRecords();

            // Additional unrelated code to make the program more complex
            Map<String, Integer> nameToAgeMap = new HashMap<>();
            for (CSVRecord rec : records) {
                String name = rec.get("name");
                int age = Integer.parseInt(rec.get("age"));
                nameToAgeMap.put(name, age);
            }

            // Perform some operations on the map
            for (Map.Entry<String, Integer> entry : nameToAgeMap.entrySet()) {
                System.out.println("Name: " + entry.getKey() + ", Age: " + entry.getValue());
            }

            // Introduce a condition to check if a name exists in the map
            String queryName = "John";
            if (nameToAgeMap.containsKey(queryName)) {
                System.out.println(queryName + " is in the map with age " + nameToAgeMap.get(queryName));
            } else {
                System.out.println(queryName + " is not in the map.");
            }

            // Read a value from the CSVRecord
            CSVRecord record = records.get(0);
            /* read */ boolean isSet = record.isSet("name");
            System.out.println(isSet);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}