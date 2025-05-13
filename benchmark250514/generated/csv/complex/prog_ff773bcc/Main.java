import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a map to simulate some complex data processing
        Map<String, Integer> nameToAge = new HashMap<>();
        nameToAge.put("John", 30);
        nameToAge.put("Jane", null);

        // Initialize a CSVFormat with a specific null string
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withNullString("NULL");

        // Prepare a CSV input string
        String csvData = "Name,Age\nJohn,30\nJane,NULL\n";

        // Additional processing before reading CSV data
        int sumOfAges = 0;
        for (Map.Entry<String, Integer> entry : nameToAge.entrySet()) {
            if (entry.getValue() != null) {
                sumOfAges += entry.getValue();
            }
        }
        System.out.println("Sum of ages before parsing CSV: " + sumOfAges);

        // Parse the CSV data
        try (Reader in = new StringReader(csvData);
             CSVParser parser = new CSVParser(in, format)) {

            // Get the first record
            CSVRecord record = parser.getRecords().get(1);

            // Simulate some unrelated complex logic
            int processedAge = 0;
            for (CSVRecord rec : parser) {
                String ageStr = rec.get("Age");
                if (!"NULL".equals(ageStr)) {
                    processedAge += Integer.parseInt(ageStr);
                }
            }
            System.out.println("Processed age sum: " + processedAge);

            // Check if the "Age" column is mapped
            /* read */ boolean isMapped = record.isMapped("Age");

            // Print the result
            System.out.println("Is 'Age' column mapped: " + isMapped);

        } catch (IOException e) {
            e.printStackTrace();
        }

        // More complex processing after CSV parsing
        nameToAge.put("Doe", 40);
        int newSumOfAges = 0;
        for (Integer age : nameToAge.values()) {
            if (age != null) {
                newSumOfAges += age;
            }
        }
        System.out.println("Sum of ages after parsing CSV: " + newSumOfAges);
    }
}