import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with allowing missing column names
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withAllowMissingColumnNames();

            // Sample CSV data
            String csvData = "name,age,city\nJohn,30,New York\nJane,25,Los Angeles";

            // Parse CSV data
            Iterable<CSVRecord> records = format.parse(new StringReader(csvData));

            // Process records into a list
            List<String> names = new ArrayList<>();
            for (CSVRecord record : records) {
                names.add(record.get("name"));
            }

            // Perform some operations on the names list
            for (String name : names) {
                System.out.println("Processing name: " + name);
            }

            // Get the first record
            CSVRecord firstRecord = records.iterator().next();

            // Perform operations on firstRecord
            String firstName = firstRecord.get("name");
            System.out.println("First name: " + firstName);

            // Check if a field is set
            /* read */ boolean isSet = firstRecord.isSet("name");
            System.out.println("Is 'name' field set: " + isSet);

            // Additional complex operations
            List<String> cities = new ArrayList<>();
            for (CSVRecord record : records) {
                cities.add(record.get("city"));
            }

            for (String city : cities) {
                System.out.println("City: " + city);
            }

            // Simulate a transformation
            List<String> transformedNames = new ArrayList<>();
            for (String name : names) {
                transformedNames.add(name.toUpperCase());
            }

            // Print transformed names
            for (String transformedName : transformedNames) {
                System.out.println("Transformed name: " + transformedName);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}