import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with first record as header
            CSVFormat csvFormat = CSVFormat.DEFAULT.withFirstRecordAsHeader(); /* write */

            // Sample CSV data
            String csvData = "Name,Age,Location\nJohn Doe,30,New York\nJane Smith,25,Los Angeles";

            // Parse the CSV data
            List<CSVRecord> records = csvFormat.parse(new StringReader(csvData)).getRecords();

            // Additional unrelated code for complexity
            ArrayList<String> names = new ArrayList<>();
            HashMap<String, Integer> ageMap = new HashMap<>();
            for (CSVRecord record : records) {
                names.add(record.get("Name"));
                ageMap.put(record.get("Name"), Integer.parseInt(record.get("Age")));
            }

            // More complex operations
            for (String name : names) {
                System.out.println("Processing: " + name);
            }

            int averageAge = 0;
            for (int age : ageMap.values()) {
                averageAge += age;
            }
            averageAge /= ageMap.size();
            System.out.println("Average Age: " + averageAge);

            // Get the first record
            CSVRecord record = records.get(0);

            // Check if a particular header is mapped
            boolean isMapped = record.isMapped("Name"); /* read */
            System.out.println("Is 'Name' mapped: " + isMapped);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}