import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.StringReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with trailing delimiter
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withTrailingDelimiter();

            // Create a sample CSV data
            String csvData = "name,age\nJohn,30\nJane,25\n";

            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);

            // Create a list to store CSVRecords
            List<CSVRecord> records = new ArrayList<>();
            records.addAll(parser.getRecords());

            // Create a HashMap to store names and ages
            HashMap<String, Integer> nameAgeMap = new HashMap<>();
            for (CSVRecord rec : records) {
                String name = rec.get("name");
                int age = Integer.parseInt(rec.get("age"));
                nameAgeMap.put(name, age);
            }

            // Get the first record
            CSVRecord record = records.get(0);

            // Perform some operations on the HashMap
            for (String name : nameAgeMap.keySet()) {
                System.out.println("Name: " + name + ", Age: " + nameAgeMap.get(name));
            }

            // Check if a specific column is set in the record
            /* read */ boolean isSet = record.isSet("name");

            // Output the result
            System.out.println("Is 'name' set: " + isSet);

            // Close the parser
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}