import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Define CSV format with allowing missing column names
            /* write */
            CSVFormat format = CSVFormat.DEFAULT.withAllowMissingColumnNames(true);

            // Sample CSV data
            String csvData = "name,age\nJohn,30\nDoe,25";

            // Parse the CSV data using the defined format
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Process all records
            List<String> names = new ArrayList<>();
            for (CSVRecord record : parser) {
                // Add names to the list
                names.add(record.get("name"));
            }

            // Perform some unrelated operations
            List<Integer> ages = new ArrayList<>();
            for (int i = 0; i < names.size(); i++) {
                ages.add(i * 10 + 20);
            }

            // Output names and ages
            for (int i = 0; i < names.size(); i++) {
                System.out.println("Name: " + names.get(i) + ", Age: " + ages.get(i));
            }

            // Get the first record
            CSVRecord firstRecord = parser.getRecords().get(0);

            // Check if a specific column is set (e.g., "age")
            /* read */
            boolean isAgeSet = firstRecord.isSet("age");

            // Output the result
            System.out.println("Is 'age' column set in the first record? " + isAgeSet);

            // Additional unrelated operations
            List<Double> salaries = new ArrayList<>();
            for (int i = 0; i < names.size(); i++) {
                salaries.add(50000.0 + i * 1500);
            }

            // Output salaries
            for (double salary : salaries) {
                System.out.println("Salary: " + salary);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}