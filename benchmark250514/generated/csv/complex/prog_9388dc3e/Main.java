import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with trim
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withTrim();

            // Sample CSV data
            String csvData = "Name, Age, Location\nJohn Doe, 30, New York\nJane Smith, 25, Los Angeles";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Get the first record
            CSVRecord record = parser.getRecords().get(0);

            // Unrelated complex logic
            ArrayList<String> names = new ArrayList<>();
            HashMap<String, Integer> ageMap = new HashMap<>();
            List<String> locations = new ArrayList<>();

            for (CSVRecord rec : parser) {
                names.add(rec.get("Name"));
                ageMap.put(rec.get("Name"), Integer.parseInt(rec.get("Age")));
                locations.add(rec.get("Location"));
            }

            // Process and print the data
            for (String name : names) {
                System.out.println("Name: " + name + ", Age: " + ageMap.get(name) + ", Location: " + locations.get(names.indexOf(name)));
            }

            // Check if a particular column is mapped
            /* read */ boolean isMapped = record.isMapped("Name");
            
            System.out.println("Is 'Name' column mapped: " + isMapped);

            // Additional complex logic
            int totalAge = 0;
            for (int age : ageMap.values()) {
                totalAge += age;
            }
            System.out.println("Total Age: " + totalAge);

            if (isMapped) {
                System.out.println("All names are mapped correctly.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}