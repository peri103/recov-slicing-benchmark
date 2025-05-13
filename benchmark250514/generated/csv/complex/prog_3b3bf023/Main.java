import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with trimming
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withTrim();

            // Sample CSV data
            String csvData = "name, age, city\nJohn Doe, 30, New York\nJane Smith, 25, Los Angeles";

            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();

            // Unrelated code: Create a map to store names and ages
            HashMap<String, Integer> nameAgeMap = new HashMap<>();
            for (CSVRecord record : records) {
                String name = record.get("name");
                int age = Integer.parseInt(record.get("age"));
                nameAgeMap.put(name, age);
            }

            // Process the map to find the oldest person
            String oldestPerson = null;
            int maxAge = 0;
            for (String name : nameAgeMap.keySet()) {
                int age = nameAgeMap.get(name);
                if (age > maxAge) {
                    maxAge = age;
                    oldestPerson = name;
                }
            }

            // Output the oldest person
            System.out.println("Oldest person: " + oldestPerson);

            // Read the first record and check if a field is mapped
            CSVRecord record = records.get(0);
            /* read */ boolean isMapped = record.isMapped("name");

            // Output the result
            System.out.println("Is 'name' mapped: " + isMapped);

            parser.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}