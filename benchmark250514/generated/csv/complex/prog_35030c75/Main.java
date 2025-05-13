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
            // Initialize CSVFormat with trailing delimiter
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withTrailingDelimiter();

            // Create a sample CSV data
            String csvData = "name,age\nJohn,30\nDoe,25\n";

            // Parse the CSV data using the format
            CSVParser parser = new CSVParser(new StringReader(csvData), format);

            // Initialize a list to store CSV records
            ArrayList<CSVRecord> records = new ArrayList<>();

            // Add all records from the parser to the list
            records.addAll(parser.getRecords());

            // Initialize a map to store names and ages
            HashMap<String, Integer> nameAgeMap = new HashMap<>();

            // Populate the map with data from CSV records
            for (CSVRecord record : records) {
                String name = record.get("name");
                int age = Integer.parseInt(record.get("age"));
                nameAgeMap.put(name, age);
            }

            // Perform some operations on the map
            if (nameAgeMap.containsKey("John")) {
                int johnAge = nameAgeMap.get("John");
                System.out.println("John's age is: " + johnAge);
            }

            // Read the first record
            CSVRecord firstRecord = records.get(0);

            // Check if a column is set in the first record
            /* read */ boolean isSet = firstRecord.isSet("name");

            // Print the result
            System.out.println("Is 'name' set in the first record? " + isSet);

            // Additional operations on the records
            for (CSVRecord record : records) {
                System.out.println("Record: " + record);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}