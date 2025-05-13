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
            // Prepare CSV data
            String csvData = "Name, Age, Location\nJohn Doe, 30, New York\nJane Smith, 25, Los Angeles";

            // Create a CSVFormat object with the specified configuration
            CSVFormat csvFormat = CSVFormat.DEFAULT;
            /* write */ csvFormat = csvFormat.withIgnoreSurroundingSpaces();

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), csvFormat);
            List<CSVRecord> records = parser.getRecords();

            // Process each record
            for (CSVRecord record : records) {
                String name = record.get("Name");
                int age = Integer.parseInt(record.get("Age"));
                String location = record.get("Location");

                System.out.printf("Name: %s, Age: %d, Location: %s%n", name, age, location);
            }

            // Unrelated operations
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                numbers.add(i * i);
            }

            for (int number : numbers) {
                System.out.println("Square: " + number);
            }

            // Check if a field is set
            CSVRecord firstRecord = records.get(0);
            /* read */ boolean isSet = firstRecord.isSet("Name");
            System.out.println("Is 'Name' field set in the first record? " + isSet);

            // Additional operations with CSV data
            for (CSVRecord record : records) {
                if (record.isSet("Location")) {
                    System.out.println("Location is set for: " + record.get("Name"));
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}