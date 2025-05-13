import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize the CSVFormat with the write method
            CSVFormat format = CSVFormat.DEFAULT /* write */.withTrim();

            // Sample CSV data
            String csvData = "Name, Age, Location\nJohn Doe, 29, New York\nJane Smith, 34, Los Angeles";

            // Parse the sample CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Create a list to store CSV records
            ArrayList<CSVRecord> recordsList = new ArrayList<>();

            // Iterate over the parsed records and add them to the list
            for (CSVRecord record : parser) {
                recordsList.add(record);
            }

            // Create a map to store names and their mapped status
            HashMap<String, Boolean> nameMappedStatus = new HashMap<>();

            // Iterate over the records list and check mapping status
            for (CSVRecord record : recordsList) {
                // Use the read method to check if the field 'Name' is mapped
                /* read */ boolean isMapped = record.isMapped("Name");
                nameMappedStatus.put(record.get("Name"), isMapped);
            }

            // Print the mapping status of each name
            for (String name : nameMappedStatus.keySet()) {
                System.out.println("Is '" + name + "' mapped: " + nameMappedStatus.get(name));
            }

            // Additional complexity: Calculate average age
            int totalAge = 0;
            for (CSVRecord record : recordsList) {
                totalAge += Integer.parseInt(record.get("Age"));
            }
            double averageAge = totalAge / (double) recordsList.size();
            System.out.println("Average Age: " + averageAge);

            // Additional complexity: Count locations
            HashMap<String, Integer> locationCount = new HashMap<>();
            for (CSVRecord record : recordsList) {
                String location = record.get("Location");
                locationCount.put(location, locationCount.getOrDefault(location, 0) + 1);
            }
            System.out.println("Location Count: " + locationCount);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}