import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.StringReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSVFormat instance with a trailing delimiter
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withTrailingDelimiter();

            // Sample CSV data
            String csvData = "name,age,city\nJohn,30,New York\nJane,25,Los Angeles\n";

            // Parse the CSV data using the format with trailing delimiter
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Process each record and collect names
            ArrayList<String> names = new ArrayList<>();
            for (CSVRecord record : parser) {
                if (record.isSet("name")) {
                    names.add(record.get("name"));
                }
            }

            // Additional processing: Calculate average age
            int totalAge = 0;
            int count = 0;
            for (CSVRecord record : parser) {
                if (record.isSet("age")) {
                    totalAge += Integer.parseInt(record.get("age"));
                    count++;
                }
            }
            double averageAge = (count > 0) ? (double) totalAge / count : 0.0;
            System.out.println("Average age: " + averageAge);

            // Get the first record
            CSVRecord firstRecord = parser.getRecords().get(0);

            // Check if a specific column is set in the record
            /* read */ boolean isSet = firstRecord.isSet("name");

            // Output the result
            System.out.println("Is 'name' column set in the first record? " + isSet);

            // Print all names collected
            System.out.println("Names collected from CSV:");
            for (String name : names) {
                System.out.println(name);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}