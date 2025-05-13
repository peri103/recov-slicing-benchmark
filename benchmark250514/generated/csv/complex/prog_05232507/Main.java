import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSV format with a null string
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withNullString("NULL");

            // Sample CSV data
            String csvData = "name,age\nJohn,25\nDoe,NULL";

            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);

            // Create a hashmap to store records
            HashMap<String, ArrayList<String>> recordsMap = new HashMap<>();

            for (CSVRecord record : parser) {
                String name = record.get("name");
                String age = record.get("age");

                // Add records to the hashmap
                recordsMap.putIfAbsent(name, new ArrayList<>());
                recordsMap.get(name).add(age);
            }

            // Process records from hashmap
            for (String name : recordsMap.keySet()) {
                ArrayList<String> ages = recordsMap.get(name);
                System.out.println("Name: " + name + ", Ages: " + ages);
            }

            // Close parser
            parser.close();

            // Re-parse the CSV data to demonstrate the read method far apart from write
            parser = new CSVParser(new StringReader(csvData), format);
            for (CSVRecord record : parser) {
                // Check if the 'age' field is set for the record
                /* read */ boolean isAgeSet = record.isSet("age");
                System.out.println("Is 'age' set for the record? " + isAgeSet);
            }
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}