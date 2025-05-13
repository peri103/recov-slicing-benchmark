import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import java.util.List;
import org.apache.commons.csv.CSVParser;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a specific delimiter
            CSVFormat csvFormat = CSVFormat.DEFAULT /* write */ .withDelimiter(';');

            // Example CSV input string
            String csvData = "name;age;city\nJohn;30;New York\nJane;25;Los Angeles";

            // Parse the CSV data using the configured CSVFormat
            CSVParser parser = new CSVParser(new StringReader(csvData), csvFormat);

            // Get the records from the parser
            List<CSVRecord> records = parser.getRecords();

            // Initialize an ArrayList to store names
            ArrayList<String> names = new ArrayList<>();

            // Initialize a HashMap to store ages
            HashMap<String, Integer> ages = new HashMap<>();

            // Process each record
            for (CSVRecord record : records) {
                // Add name to the list
                names.add(record.get(0));

                // Add age to the map
                ages.put(record.get(0), Integer.parseInt(record.get(1)));
            }

            // Print all names
            for (String name : names) {
                System.out.println("Name: " + name);
            }

            // Print all ages
            for (String name : ages.keySet()) {
                System.out.println("Age of " + name + ": " + ages.get(name));
            }

            // Read the first record and convert it to a string
            /* read */ String recordString = records.get(0).toString();

            // Print the record string
            System.out.println("First Record: " + recordString);

            // Close the parser
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}