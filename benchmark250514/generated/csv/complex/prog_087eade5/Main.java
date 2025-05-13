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
            // Initialize CSVFormat with the write method
            CSVFormat format = CSVFormat.DEFAULT /* write */.withIgnoreSurroundingSpaces(true);

            // Prepare a sample CSV data
            String csvData = "Name, Age, City\nJohn Doe, 30, New York\nJane Doe, 25, Los Angeles";
            StringReader reader = new StringReader(csvData);

            // Parse the CSV data using the format
            List<CSVRecord> records = format.parse(reader).getRecords();

            // Additional data processing
            Map<String, Integer> ageMap = new HashMap<>();
            for (CSVRecord record : records) {
                String name = record.get("Name");
                int age = Integer.parseInt(record.get("Age"));
                ageMap.put(name, age);
            }

            // Perform some operations with the map
            for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
                System.out.println(entry.getKey() + " is " + entry.getValue() + " years old.");
            }

            // Additional logic to find the oldest person
            String oldestPerson = null;
            int maxAge = -1;
            for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
                if (entry.getValue() > maxAge) {
                    maxAge = entry.getValue();
                    oldestPerson = entry.getKey();
                }
            }
            System.out.println("The oldest person is " + oldestPerson + " with age " + maxAge);

            // Use the read method on the first record
            CSVRecord firstRecord = records.get(0);
            /* read */ boolean isSet = firstRecord.isSet("Name");

            // Print the result
            System.out.println("Is 'Name' set in the first record? " + isSet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}