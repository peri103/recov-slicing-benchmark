import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import java.util.List;
import org.apache.commons.csv.CSVParser;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with the write method
            /* write */ CSVFormat csvFormat = CSVFormat.DEFAULT.withTrailingDelimiter();

            // Sample CSV data
            String csvData = "Name,Age,Location\nJohn Doe,29,New York\nJane Smith,34,California";

            // Parse the CSV data using CSVParser
            CSVParser parser = new CSVParser(new StringReader(csvData), csvFormat);
            List<CSVRecord> records = parser.getRecords();

            // Create a HashMap to store data from CSV
            HashMap<String, Integer> ageMap = new HashMap<>();

            // Populate HashMap with data from CSV records
            for (CSVRecord record : records) {
                String name = record.get("Name");
                int age = Integer.parseInt(record.get("Age"));
                ageMap.put(name, age);
            }

            // Perform operations on the HashMap
            for (String name : ageMap.keySet()) {
                System.out.println("Name: " + name + ", Age: " + ageMap.get(name));
            }

            // Use the read method on the first record
            CSVRecord record = records.get(0);
            /* read */ boolean isSet = record.isSet("Name");

            // Print the result
            System.out.println("Is 'Name' set in the first record? " + isSet);

            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}