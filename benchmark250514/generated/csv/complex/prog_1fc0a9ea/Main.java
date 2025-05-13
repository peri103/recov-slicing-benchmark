import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Sample CSV data with empty lines
        String csvData = "name,age,city\nJohn,25,New York\n\nJane,30,Los Angeles";

        try {
            // Create a CSVFormat object with ignoring empty lines
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withIgnoreEmptyLines();

            // Parse the CSV data
            Iterable<CSVRecord> records = format.parse(new StringReader(csvData));

            // Initialize a map to store names and ages
            Map<String, Integer> nameAgeMap = new HashMap<>();

            // Process the records and fill the map
            for (CSVRecord record : records) {
                String name = record.get("name");
                int age = Integer.parseInt(record.get("age"));
                nameAgeMap.put(name, age);
            }

            // Perform some operations on the map
            for (Map.Entry<String, Integer> entry : nameAgeMap.entrySet()) {
                System.out.println("Name: " + entry.getKey() + ", Age: " + entry.getValue());
            }

            // Get the iterator for the records again
            Iterator<CSVRecord> iterator = records.iterator();

            // Read the first record
            if (iterator.hasNext()) {
                CSVRecord record = iterator.next();
                // Check if the 'name' column is set
                /* read */ boolean isNameSet = record.isSet("name");
                System.out.println("Is 'name' set in the first record? " + isNameSet);
            }

            // Additional complex logic: Calculate average age
            int totalAge = 0;
            for (int age : nameAgeMap.values()) {
                totalAge += age;
            }
            double averageAge = totalAge / (double) nameAgeMap.size();
            System.out.println("Average Age: " + averageAge);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}