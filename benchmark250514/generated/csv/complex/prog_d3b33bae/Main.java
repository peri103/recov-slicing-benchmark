import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a delimiter
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withDelimiter(';');

            // Prepare a CSV input string
            String csvData = "name;age;city\nJohn;30;New York\nJane;25;Los Angeles\nDoe;22;Chicago";

            // Parse the CSV data using the format with the delimiter
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Get all records from the parsed data
            List<CSVRecord> records = parser.getRecords();

            // Create a list to store extracted names
            ArrayList<String> names = new ArrayList<>();

            // Create a map to store age mapping
            HashMap<String, Integer> ageMap = new HashMap<>();

            // Extract names and ages from the records and store them
            for (CSVRecord rec : records) {
                names.add(rec.get(0)); // Assuming the first column is 'name'
                ageMap.put(rec.get(0), Integer.parseInt(rec.get(1))); // Assuming the second column is 'age'
            }

            // Print all names
            for (String name : names) {
                System.out.println("Name: " + name);
            }

            // Print age map
            for (String name : ageMap.keySet()) {
                System.out.println("Age of " + name + ": " + ageMap.get(name));
            }

            // Get the first record and read it as a string
            CSVRecord firstRecord = records.get(0);

            // Perform some complex operations
            int totalAge = 0;
            for (int age : ageMap.values()) {
                totalAge += age;
            }
            double averageAge = totalAge / (double) ageMap.size();
            System.out.println("Average Age: " + averageAge);

            // Read the first record as a string
            /* read */ String recordString = firstRecord.toString();

            // Print the record string
            System.out.println(recordString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}