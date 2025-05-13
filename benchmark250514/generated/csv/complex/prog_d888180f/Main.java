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
            // Initialize CSVFormat with the write method
            CSVFormat format = CSVFormat.DEFAULT.withAllowMissingColumnNames(true); /* write */

            // Sample CSV data
            String csvData = "name,age\nJohn,30\nJane,25";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Process all records and store them in a map
            HashMap<String, Integer> nameAgeMap = new HashMap<>();
            for (CSVRecord record : parser) {
                String name = record.get("name");
                int age = Integer.parseInt(record.get("age"));
                nameAgeMap.put(name, age);
            }

            // Perform operations on the map
            ArrayList<String> names = new ArrayList<>(nameAgeMap.keySet());
            for (String name : names) {
                System.out.println("Name: " + name + ", Age: " + nameAgeMap.get(name));
            }

            // Get the first record
            CSVRecord firstRecord = parser.getRecords().get(0);

            // Use the read method to check if a column is set
            boolean isSet = firstRecord.isSet("name"); /* read */

            System.out.println("Is 'name' column set in the first record? " + isSet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}