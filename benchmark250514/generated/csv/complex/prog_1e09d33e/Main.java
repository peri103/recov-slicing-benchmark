import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a CSVFormat instance with a trailing delimiter
        /* write */ CSVFormat format = CSVFormat.DEFAULT.withTrailingDelimiter();

        // Sample CSV data
        String csvData = "name,email,age\nJohn Doe,john.doe@example.com,30\nJane Smith,jane.smith@example.com,25\n";

        try {
            // Parse the CSV data using the format
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();

            // Access the first record
            CSVRecord record = records.get(0);

            // Additional code to make the program more complex
            ArrayList<String> names = new ArrayList<>();
            Map<String, Integer> ageMap = new HashMap<>();

            // Process the records to populate names and ageMap
            for (CSVRecord rec : records) {
                names.add(rec.get("name"));
                ageMap.put(rec.get("name"), Integer.parseInt(rec.get("age")));
            }

            // Print all names
            for (String name : names) {
                System.out.println("Name: " + name);
            }

            // Print all ages
            for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
                System.out.println("Age of " + entry.getKey() + ": " + entry.getValue());
            }

            // Check if a specific column is set in the first record
            /* read */ boolean isSet = record.isSet("name");
            System.out.println("Is 'name' column set in the first record? " + isSet);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}