import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with trailing delimiter
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withTrailingDelimiter();

            // Sample CSV input
            String csvData = "name,age,city\nJohn,30,New York\nAlice,25,Los Angeles";

            // Parse the CSV data using the format with trailing delimiter
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Read all records
            List<CSVRecord> records = parser.getRecords();

            // Initialize a list to store names
            List<String> names = new ArrayList<>();

            // Process each record and collect names
            for (CSVRecord record : records) {
                if (record.isSet("name")) {
                    names.add(record.get("name"));
                }
            }

            // Perform some operations on names list
            for (String name : names) {
                System.out.println("Processing name: " + name);
            }

            // Read the first record
            CSVRecord firstRecord = records.get(0);

            // Perform additional operations
            int totalAge = 0;
            for (CSVRecord record : records) {
                totalAge += Integer.parseInt(record.get("age"));
            }
            System.out.println("Total age: " + totalAge);

            // Check if a specific column is set in the first record
            /* read */ boolean isSet = firstRecord.isSet("name");

            // Output the result
            System.out.println("Is 'name' column set? " + isSet);

            // Additional complex operations
            List<Integer> ages = new ArrayList<>();
            for (CSVRecord record : records) {
                ages.add(Integer.parseInt(record.get("age")));
            }

            for (int age : ages) {
                if (age > 25) {
                    System.out.println("Age greater than 25: " + age);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}