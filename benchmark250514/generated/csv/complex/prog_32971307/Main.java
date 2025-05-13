import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize a CSVFormat object and configure it
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withIgnoreSurroundingSpaces(true);

        // Sample CSV data as a String
        String csvData = "Name, Age\nJohn Doe, 25\nJane Smith, 30";

        try {
            // Parse the CSV data using the configured format
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Initialize a list and a map to store records and their properties
            ArrayList<CSVRecord> recordsList = new ArrayList<>();
            HashMap<String, Boolean> recordProperties = new HashMap<>();

            // Iterate over the records and perform operations
            for (CSVRecord record : parser) {
                recordsList.add(record);
                recordProperties.put(record.get("Name"), record.isSet("Age"));
            }

            // Perform additional operations on the records
            for (CSVRecord record : recordsList) {
                System.out.println("Name: " + record.get("Name") + ", Age: " + record.get("Age"));
            }

            // Use the read method to check if a value is set in the first record
            CSVRecord firstRecord = recordsList.get(0);
            /* read */ boolean isSet = firstRecord.isSet("Name");

            // Print the result
            System.out.println("Is 'Name' set in the first record? " + isSet);

            // Print properties of all records
            for (String name : recordProperties.keySet()) {
                System.out.println("Record for " + name + " has 'Age' set: " + recordProperties.get(name));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}