import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import java.util.List;
import org.apache.commons.csv.CSVParser;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSV format with header comments
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withHeaderComments("This is a header comment");

            // Sample CSV input string
            String csvData = "# This is a header comment\nName, Age\nJohn, 30\nDoe, 25";

            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();

            // Additional code to process CSV records and store in a map
            Map<String, Integer> nameToAgeMap = new HashMap<>();
            for (CSVRecord rec : records) {
                if (!rec.get(0).equals("Name")) { // Skip header
                    String name = rec.get(0);
                    int age = Integer.parseInt(rec.get(1));
                    nameToAgeMap.put(name, age);
                }
            }

            // Perform some operations on the map
            int totalAge = 0;
            for (int age : nameToAgeMap.values()) {
                totalAge += age;
            }
            double averageAge = (double) totalAge / nameToAgeMap.size();
            System.out.println("Average Age: " + averageAge);

            // Read the comment from the first record
            CSVRecord record = records.get(0);
            /* read */ String comment = record.getComment();
            System.out.println("Header Comment: " + comment);

            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}