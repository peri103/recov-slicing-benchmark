import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with header
        CSVFormat format = CSVFormat.DEFAULT.withFirstRecordAsHeader(); // /* write */

        // Sample CSV data
        String csvData = "Name, Age\nJohn, 30\nJane, 25";

        // Additional unrelated code to increase complexity
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");

        Map<String, Integer> ageMap = new HashMap<>();
        ageMap.put("Alice", 28);
        ageMap.put("Bob", 32);

        for (String name : names) {
            System.out.println("Name: " + name + ", Age: " + ageMap.get(name));
        }

        // Parse the CSV data
        try {
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Get the first record
            CSVRecord record = parser.getRecords().get(0);

            // More unrelated code
            List<Integer> ages = new ArrayList<>();
            ages.add(30);
            ages.add(25);
            int sumOfAges = 0;
            for (int age : ages) {
                sumOfAges += age;
            }
            System.out.println("Sum of ages: " + sumOfAges);

            // Check if a header is mapped
            boolean isMapped = record.isMapped("Name"); // /* read */

            // Output the result
            System.out.println("Is 'Name' header mapped? " + isMapped);

            // Additional processing
            for (CSVRecord rec : parser) {
                String name = rec.get("Name");
                String age = rec.get("Age");
                System.out.println("CSV Record - Name: " + name + ", Age: " + age);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}