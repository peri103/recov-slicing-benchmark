import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with trim option
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withTrim();

            // Sample CSV data
            String csvData = "Name, Age, City\nJohn Doe, 29, New York\nJane Smith, 34, Los Angeles";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Store CSV records in a HashMap
            HashMap<String, CSVRecord> recordMap = new HashMap<>();
            for (CSVRecord record : parser) {
                String name = record.get("Name");
                recordMap.put(name, record);
            }

            // Perform some operations on the records
            CSVRecord johnRecord = recordMap.get("John Doe");
            if (johnRecord != null) {
                System.out.println("John's age: " + johnRecord.get("Age"));
            }

            // More complex operations
            for (String key : recordMap.keySet()) {
                CSVRecord record = recordMap.get(key);
                System.out.println("Processing record for: " + key);
            }

            // Check if a column is mapped
            CSVRecord janeRecord = recordMap.get("Jane Smith");
            if (janeRecord != null) {
                /* read */ boolean isMapped = janeRecord.isMapped("Name");
                System.out.println("Is 'Name' column mapped for Jane? " + isMapped);
            }

            // Additional logic to demonstrate complexity
            int totalAge = 0;
            for (CSVRecord record : recordMap.values()) {
                totalAge += Integer.parseInt(record.get("Age"));
            }
            System.out.println("Total age of all records: " + totalAge);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}