import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Sample CSV data
        String csvData = "name,age\nJohn,30\nDoe,25";

        try {
            // Create a CSVFormat object and configure it to use the first record as header
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withFirstRecordAsHeader();

            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);

            // Additional logic: Create a map to store age by name
            Map<String, Integer> ageMap = new HashMap<>();

            // Iterate through records and populate the map
            for (CSVRecord rec : parser) {
                String name = rec.get("name");
                int age = Integer.parseInt(rec.get("age"));
                ageMap.put(name, age);
            }

            // Perform some operations on the map
            int totalAge = ageMap.values().stream().mapToInt(Integer::intValue).sum();
            System.out.println("Total age: " + totalAge);

            // Get the first record
            CSVRecord record = parser.getRecords().get(0);

            // Check if a header is mapped
            /* read */ boolean isMapped = record.isMapped("name");

            // Print the result
            System.out.println("Is 'name' header mapped: " + isMapped);

            // More operations: Print ages from the map
            for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
                System.out.println(entry.getKey() + " is " + entry.getValue() + " years old.");
            }

            // Close the parser
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}