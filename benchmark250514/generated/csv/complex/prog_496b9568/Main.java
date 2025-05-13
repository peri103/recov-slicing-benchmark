import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSVFormat object and configure it
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withIgnoreEmptyLines(true);

            // Sample CSV data
            String csvData = "name,age,city\nJohn,30,New York\n\nJane,25,Los Angeles";

            // Parse the CSV data using the configured format
            List<CSVRecord> records = new ArrayList<>();
            try (StringReader reader = new StringReader(csvData)) {
                records = format.parse(reader).getRecords();
            }

            // Additional processing: build a map of names to ages
            Map<String, Integer> nameToAgeMap = new HashMap<>();
            for (CSVRecord record : records) {
                String name = record.get("name");
                int age = Integer.parseInt(record.get("age"));
                nameToAgeMap.put(name, age);
            }

            // Process the map and print names with ages above 25
            for (Map.Entry<String, Integer> entry : nameToAgeMap.entrySet()) {
                if (entry.getValue() > 25) {
                    System.out.println(entry.getKey() + " is older than 25.");
                }
            }

            // Read the consistency of the first record
            if (!records.isEmpty()) {
                CSVRecord record = records.get(0);
                /* read */ boolean isConsistent = record.isConsistent();
                System.out.println("Record is consistent: " + isConsistent);
            }

            // Additional unrelated code: Calculate sum of ages
            int sumOfAges = 0;
            for (int age : nameToAgeMap.values()) {
                sumOfAges += age;
            }
            System.out.println("Sum of ages: " + sumOfAges);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}