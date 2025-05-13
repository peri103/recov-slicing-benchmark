import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.util.List;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header comments
            CSVFormat format = CSVFormat.DEFAULT.withHeaderComments("This is a comment");
            /* write */

            // Prepare a sample CSV data
            String csvData = "# This is a comment\nName,Age\nJohn Doe,30\nJane Doe,25";
            StringReader csvReader = new StringReader(csvData);
            
            // Parse the CSV data
            CSVParser parser = new CSVParser(csvReader, format);
            List<CSVRecord> records = parser.getRecords();
            
            // Create a map to store names and ages
            Map<String, Integer> nameAgeMap = new HashMap<>();
            for (CSVRecord record : records) {
                String name = record.get("Name");
                int age = Integer.parseInt(record.get("Age"));
                nameAgeMap.put(name, age);
            }
            
            // Perform some operations on the map
            nameAgeMap.put("Alice", 28);
            nameAgeMap.put("Bob", 32);
            int totalAge = 0;
            for (Integer age : nameAgeMap.values()) {
                totalAge += age;
            }
            System.out.println("Total Age: " + totalAge);
            
            // Read the comment from the first record
            /* read */
            String comment = records.get(0).getComment();
            System.out.println(comment);
            
            // Additional operations
            String longestName = "";
            for (String name : nameAgeMap.keySet()) {
                if (name.length() > longestName.length()) {
                    longestName = name;
                }
            }
            System.out.println("Longest Name: " + longestName);
            
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}