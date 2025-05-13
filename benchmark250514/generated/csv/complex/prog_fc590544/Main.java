import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.StringReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSV data and format
            String csvData = "Name, Age\nJohn, 30\nJane, 25";
            CSVFormat format = CSVFormat.DEFAULT;
            
            // Additional unrelated code: Create a map to store some data
            Map<String, Integer> ageMap = new HashMap<>();
            ageMap.put("Alice", 28);
            ageMap.put("Bob", 32);
            
            // Iterate over the map and print its contents
            for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
            
            // Modify the CSV format with trim
            /* write */ format = format.withTrim();

            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);
            CSVRecord record = parser.getRecords().get(0);

            // Additional unrelated code: Perform some calculations
            int sum = 0;
            for (int age : ageMap.values()) {
                sum += age;
            }
            System.out.println("Sum of ages: " + sum);

            // Check if a column is mapped in the record
            /* read */ boolean isMapped = record.isMapped("Name");
            System.out.println("Is 'Name' mapped in the record? " + isMapped);

            // Additional unrelated code: Print CSV record details
            for (CSVRecord rec : parser) {
                System.out.println("Record: " + rec);
            }

            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}