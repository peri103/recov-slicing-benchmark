import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with the specified configuration
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withAllowMissingColumnNames(true);

            // Sample CSV data
            String csvData = "name,age\nJohn,30\nJane,25\nDoe,40";

            // Parse the CSV data using the format
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Get the records
            ArrayList<CSVRecord> records = new ArrayList<>(parser.getRecords());

            // Additional complex logic: Create a map to store names and ages
            HashMap<String, Integer> nameAgeMap = new HashMap<>();
            for (CSVRecord record : records) {
                if (record.isSet("name") && record.isSet("age")) {
                    nameAgeMap.put(record.get("name"), Integer.parseInt(record.get("age")));
                }
            }

            // Print the map
            System.out.println("Name-Age map: " + nameAgeMap);

            // Process each record to find a specific condition
            for (CSVRecord record : records) {
                if (record.isSet("name") && record.get("name").equals("Doe")) {
                    System.out.println("Found Doe's record with age: " + record.get("age"));
                }
            }

            // Check if a column is set in the first record
            CSVRecord firstRecord = records.get(0);
            /* read */ boolean isSet = firstRecord.isSet("name");
            System.out.println("Is 'name' column set in the first record? " + isSet);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}