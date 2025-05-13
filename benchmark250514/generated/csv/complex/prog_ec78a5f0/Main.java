import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a trailing delimiter
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withTrailingDelimiter();

            // Prepare a sample CSV input
            String csvData = "name,age\nJohn,30\nJane,25\n";

            // Parse the CSV data using the format
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Perform some unrelated operations
            List<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                numbers.add(i * 2);
            }

            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            System.out.println("Sum of numbers: " + sum);

            // Get the first record
            CSVRecord record = parser.getRecords().get(0);

            // Perform more unrelated operations
            List<String> names = new ArrayList<>();
            names.add("Alice");
            names.add("Bob");
            names.add("Charlie");

            for (String name : names) {
                System.out.println("Name: " + name);
            }

            // Read a value from the CSVRecord
            /* read */ boolean isSet = record.isSet("name");

            // Output the result
            System.out.println("Is 'name' set in the first record: " + isSet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}