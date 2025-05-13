import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with the write method
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withAllowMissingColumnNames(true);

        // Create a CSV string to parse
        String csvData = "name,age\nJohn Doe,30\nJane Doe,25";

        // Parse the CSV string using the format
        List<CSVRecord> records = null;
        try {
            records = format.parse(new StringReader(csvData)).getRecords();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Additional complex code: Using a HashMap to store record information
        Map<String, Integer> nameToAgeMap = new HashMap<>();
        if (records != null) {
            for (CSVRecord record : records) {
                String name = record.get("name");
                int age = Integer.parseInt(record.get("age"));
                nameToAgeMap.put(name, age);
            }
        }

        // Perform operations on the map
        for (Map.Entry<String, Integer> entry : nameToAgeMap.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Age: " + entry.getValue());
        }

        // Read method to check if a column is set for the first record
        if (records != null && !records.isEmpty()) {
            CSVRecord record = records.get(0);
            /* read */ boolean isSet = record.isSet("name");
            System.out.println("Is 'name' set: " + isSet);
        }

        // Additional complex code: Calculate the average age
        int totalAge = 0;
        for (int age : nameToAgeMap.values()) {
            totalAge += age;
        }
        double averageAge = totalAge / (double) nameToAgeMap.size();
        System.out.println("Average Age: " + averageAge);
    }
}