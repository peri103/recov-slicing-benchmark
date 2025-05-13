import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with trimming enabled
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withTrim();

            // Example CSV data
            String csvData = "name, age\nJohn Doe, 30\nJane Smith, 25";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Retrieve all records
            List<CSVRecord> records = parser.getRecords();

            // Create a map to store names and ages
            HashMap<String, Integer> nameAgeMap = new HashMap<>();

            // Process each record and populate the map
            for (CSVRecord record : records) {
                String name = record.get("name");
                int age = Integer.parseInt(record.get("age"));
                nameAgeMap.put(name, age);
            }

            // Perform some operations on the map
            for (String name : nameAgeMap.keySet()) {
                System.out.println(name + " is " + nameAgeMap.get(name) + " years old.");
            }

            // Retrieve the first record again and check if a specific column is mapped
            CSVRecord firstRecord = records.get(0);
            /* read */ boolean isMapped = firstRecord.isMapped("name");
            System.out.println("Is 'name' column mapped? " + isMapped);

            // Additional complex operations
            int totalAge = 0;
            for (int age : nameAgeMap.values()) {
                totalAge += age;
            }
            System.out.println("Total age of all individuals: " + totalAge);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}