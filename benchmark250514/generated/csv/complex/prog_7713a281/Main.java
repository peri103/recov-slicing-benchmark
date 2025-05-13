import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSV format with the write method
            CSVFormat format = /* write */ CSVFormat.DEFAULT.withIgnoreEmptyLines();

            // Sample CSV data
            String csvData = "name,age\nJohn,30\n\nJane,25";

            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);

            // Additional processing: Create a map to store name-age pairs
            Map<String, Integer> nameAgeMap = new HashMap<>();

            // Access a CSVRecord and use the read method
            for (CSVRecord record : parser) {
                String name = record.get("name");
                int age = Integer.parseInt(record.get("age"));
                
                // Store the name-age pair in the map
                nameAgeMap.put(name, age);

                /* read */ boolean isSet = record.isSet("name");
                System.out.println("Is 'name' set? " + isSet);
            }

            // Print the name-age map
            for (Map.Entry<String, Integer> entry : nameAgeMap.entrySet()) {
                System.out.println("Name: " + entry.getKey() + ", Age: " + entry.getValue());
            }

            // Close the parser
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}