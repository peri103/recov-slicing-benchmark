import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize CSV format with the write method
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withAllowMissingColumnNames(true);

        // Sample CSV data
        String csvData = "name,age,city\nJohn,30,New York\nDoe,25,Los Angeles";

        try {
            // Parse the CSV data using the format
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Retrieve records
            List<CSVRecord> records = parser.getRecords();

            // Create a map to store the data
            Map<String, Integer> ageMap = new HashMap<>();

            for (CSVRecord record : records) {
                String name = record.get("name");
                int age = Integer.parseInt(record.get("age"));
                ageMap.put(name, age);
            }

            // Perform some operations on the map
            for (String name : ageMap.keySet()) {
                System.out.println(name + " is " + ageMap.get(name) + " years old.");
            }

            // Use the read method on the first record
            CSVRecord firstRecord = records.get(0);
            /* read */ boolean isSet = firstRecord.isSet("name");

            // Output the result
            System.out.println("Is 'name' set in the first record? " + isSet);

            // Additional operations
            int totalAge = ageMap.values().stream().mapToInt(Integer::intValue).sum();
            System.out.println("Total age of all individuals: " + totalAge);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}