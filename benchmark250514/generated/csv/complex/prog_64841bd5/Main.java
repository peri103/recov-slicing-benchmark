import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with the write method
            CSVFormat csvFormat = CSVFormat.DEFAULT;
            /* write */ csvFormat = csvFormat.withIgnoreSurroundingSpaces();

            // Prepare a sample CSV input
            String csvData = "Name, Age\n John Doe , 29\n Jane Doe , 31";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), csvFormat);
            CSVRecord record = parser.getRecords().get(0);

            // Add some unrelated complex code
            ArrayList<String> names = new ArrayList<>();
            HashMap<String, Integer> ageMap = new HashMap<>();

            for (CSVRecord rec : parser) {
                String name = rec.get(0).trim();
                int age = Integer.parseInt(rec.get(1).trim());
                names.add(name);
                ageMap.put(name, age);
            }

            // Process the names and ages
            for (String name : names) {
                System.out.println("Name: " + name + ", Age: " + ageMap.get(name));
            }

            // Use the read method
            /* read */ boolean isConsistent = record.isConsistent();
            System.out.println("Is the first record consistent? " + isConsistent);

            // More complex code
            int totalAge = 0;
            for (int age : ageMap.values()) {
                totalAge += age;
            }
            System.out.println("Total Age: " + totalAge);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}