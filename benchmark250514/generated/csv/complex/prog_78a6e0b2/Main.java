import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSVFormat object
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withAllowMissingColumnNames(true);

            // Sample CSV data
            String csvData = "Name,Age,Location\nJohn,30,USA\nDoe,25,UK";

            // Parse the CSV data using the format
            CSVParser parser = new CSVParser(new StringReader(csvData), format);

            // Access the records
            List<CSVRecord> records = parser.getRecords();

            // Perform some operations on the records
            List<String> names = new ArrayList<>();
            for (CSVRecord record : records) {
                names.add(record.get("Name"));
            }

            // Print the names
            System.out.println("Names in the CSV:");
            for (String name : names) {
                System.out.println(name);
            }

            // Additional complex operations
            int totalAge = 0;
            for (CSVRecord record : records) {
                totalAge += Integer.parseInt(record.get("Age"));
            }
            System.out.println("Total Age: " + totalAge);

            // Use the isSet method to check if a column is set in the first record
            CSVRecord firstRecord = records.get(0);
            /* read */ boolean isSet = firstRecord.isSet("Location");
            System.out.println("Is 'Location' column set in the first record? " + isSet);

            // More complex operations
            List<String> locations = new ArrayList<>();
            for (CSVRecord record : records) {
                if (record.isSet("Location")) {
                    locations.add(record.get("Location"));
                }
            }

            // Print the locations
            System.out.println("Locations in the CSV:");
            for (String location : locations) {
                System.out.println(location);
            }

            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}