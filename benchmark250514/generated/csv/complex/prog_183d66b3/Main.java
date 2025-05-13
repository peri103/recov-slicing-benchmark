import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the CSVFormat and use the write method
        CSVFormat csvFormat = CSVFormat.DEFAULT;
        /* write */ csvFormat = csvFormat.withIgnoreEmptyLines(true);

        // Sample CSV data
        String csvData = "Name, Age, City\nJohn, 30, New York\n, , \nJane, 25, Los Angeles";

        // Additional unrelated data structures
        ArrayList<String> names = new ArrayList<>();
        HashMap<String, Integer> ageMap = new HashMap<>();

        try {
            // Parse the CSV data
            List<CSVRecord> records = csvFormat.parse(new StringReader(csvData)).getRecords();

            // Populate additional data structures
            for (CSVRecord rec : records) {
                if (rec.isSet("Name")) {
                    names.add(rec.get("Name"));
                }
                if (rec.isSet("Age")) {
                    ageMap.put(rec.get("Name"), Integer.parseInt(rec.get("Age")));
                }
            }

            // Use the read method
            CSVRecord record = records.get(0);
            /* read */ boolean isSet = record.isSet("Name");

            // Output the result of the original read
            System.out.println("Is 'Name' set in the first record? " + isSet);

            // Additional processing and output
            System.out.println("Names from CSV:");
            for (String name : names) {
                System.out.println(name);
            }

            System.out.println("Age map:");
            for (String name : ageMap.keySet()) {
                System.out.println(name + ": " + ageMap.get(name));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}