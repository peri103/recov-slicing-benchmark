import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import org.apache.commons.csv.CSVParser;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSVFormat instance and configure it
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withIgnoreSurroundingSpaces(true);

            // Sample CSV data
            String csvData = "Name, Age\nJohn Doe, 30\nJane Smith, 25";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Retrieve the records
            List<CSVRecord> records = parser.getRecords();

            // Unrelated complex operations
            HashMap<String, Integer> ageMap = new HashMap<>();
            for (CSVRecord rec : records) {
                String name = rec.get("Name");
                int age = Integer.parseInt(rec.get("Age"));
                ageMap.put(name, age);
            }

            ArrayList<String> names = new ArrayList<>(ageMap.keySet());
            names.sort((a, b) -> ageMap.get(a) - ageMap.get(b));

            for (String name : names) {
                System.out.println(name + " is " + ageMap.get(name) + " years old.");
            }

            // Access a specific record and check if a specific column is set
            CSVRecord record = records.get(0);
            /* read */ boolean isSet = record.isSet("Name");

            // Output the result
            System.out.println("Is 'Name' column set in the first record? " + isSet);

            // Additional unrelated complex operations
            int totalAge = 0;
            for (int age : ageMap.values()) {
                totalAge += age;
            }
            double averageAge = (double) totalAge / ageMap.size();
            System.out.println("Average age: " + averageAge);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}