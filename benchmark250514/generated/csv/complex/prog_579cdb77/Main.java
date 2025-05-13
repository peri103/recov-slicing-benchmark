import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.List;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Sample CSV data
            String csvData = "Name,Age,Location\nJohn,30,USA\nDoe,25,UK";

            // Create a CSVFormat object with trailing delimiter
            /* write */ CSVFormat csvFormat = CSVFormat.DEFAULT.withTrailingDelimiter();

            // Parse the CSV data using the csvFormat
            List<CSVRecord> records = csvFormat.parse(new StringReader(csvData)).getRecords();

            // Create an ArrayList to store names
            ArrayList<String> names = new ArrayList<>();

            // Create a HashMap to store age and location
            HashMap<String, String> ageLocationMap = new HashMap<>();

            // Process each record and populate the ArrayList and HashMap
            for (CSVRecord record : records) {
                String name = record.get("Name");
                String age = record.get("Age");
                String location = record.get("Location");

                names.add(name);
                ageLocationMap.put(age, location);
            }

            // Access the first record and check if a specific column is set
            CSVRecord firstRecord = records.get(0);
            /* read */ boolean isSet = firstRecord.isSet("Name");

            // Output the result
            System.out.println("Is 'Name' column set in the first record? " + isSet);

            // Print the names stored in the ArrayList
            System.out.println("Names List: " + names);

            // Print the age-location mapping stored in the HashMap
            System.out.println("Age-Location Map: " + ageLocationMap);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}