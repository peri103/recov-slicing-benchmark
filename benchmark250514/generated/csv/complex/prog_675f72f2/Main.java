import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with specific configuration
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces();

            // Sample CSV data
            String csvData = "name, age\nJohn, 30\nJane, 25";

            // Parse the CSV data using the configured format
            CSVParser parser = CSVParser.parse(csvData, format);
            List<CSVRecord> records = parser.getRecords();

            // Additional complexity: Handling multiple records
            ArrayList<String> names = new ArrayList<>();
            for (CSVRecord record : records) {
                // Extracting names from the CSV records
                if (record.isSet("name")) {
                    names.add(record.get("name"));
                }
            }

            // Additional complexity: Process extracted names
            for (String name : names) {
                System.out.println("Processing name: " + name);
            }

            // Perform some unrelated operations
            int sum = 0;
            for (int i = 0; i < 5; i++) {
                sum += i;
                System.out.println("Current sum: " + sum);
            }

            // Read the data using CSVRecord's method
            /* read */ boolean isSet = records.get(0).isSet("name");
            System.out.println("Is 'name' set in the first record? " + isSet);

            // More unrelated operations
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                numbers.add(i * 2);
            }
            for (Integer number : numbers) {
                System.out.println("Number: " + number);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}