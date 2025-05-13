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
            // Initialize CSVFormat with header comments
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withHeaderComments("This is a comment");

            // Sample CSV content
            String csvData = "# This is a comment\nName,Age\nJohn,30\nDoe,25";

            // Parse the CSV content
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();

            // Create a map to store the records data
            Map<String, Integer> nameToAgeMap = new HashMap<>();
            for (CSVRecord rec : records) {
                String name = rec.get("Name");
                int age = Integer.parseInt(rec.get("Age"));
                nameToAgeMap.put(name, age);
            }

            // Print the map
            System.out.println("Name to Age Map: " + nameToAgeMap);

            // Assuming we want to read the comment from the first record
            CSVRecord record = records.get(0);
            /* read */ String comment = record.getComment();

            // Print the comment
            System.out.println("Header Comment: " + comment);

            // Perform some calculations with the age data
            int totalAge = 0;
            for (int age : nameToAgeMap.values()) {
                totalAge += age;
            }
            System.out.println("Total Age: " + totalAge);

            // Find the average age
            double averageAge = (double) totalAge / nameToAgeMap.size();
            System.out.println("Average Age: " + averageAge);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}