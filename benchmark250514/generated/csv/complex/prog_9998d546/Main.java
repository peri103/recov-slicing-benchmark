import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header comments
            CSVFormat format = CSVFormat.DEFAULT /* write */.withHeaderComments("Header Comment");

            // Create a sample CSV data
            String csvData = "Name, Age\nJohn, 30\nDoe, 25";

            // Parse the CSV data using the format
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();

            // Create a map to store ages
            Map<String, Integer> ageMap = new HashMap<>();

            // Populate the map with names and ages from the CSV records
            for (CSVRecord record : records) {
                String name = record.get("Name");
                int age = Integer.parseInt(record.get("Age"));
                ageMap.put(name, age);
            }

            // Calculate the average age
            double totalAge = 0;
            for (int age : ageMap.values()) {
                totalAge += age;
            }
            double averageAge = totalAge / ageMap.size();

            // Output the average age
            System.out.println("Average age: " + averageAge);

            // Read the first record and check if "Name" is set
            CSVRecord record = records.get(0);
            /* read */ boolean isNameSet = record.isSet("Name");

            // Output the result
            System.out.println("Is 'Name' set in the first record? " + isNameSet);

            // Additional logic to manipulate the age map
            ageMap.put("Alice", 28);
            ageMap.put("Bob", 32);
            System.out.println("Updated age map: " + ageMap);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}