import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with write method
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withIgnoreSurroundingSpaces(true);

            // Prepare a sample CSV input
            String csvData = "name, age\nJohn Doe, 30\nJane Doe, 25";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Initialize additional data structures for complexity
            ArrayList<String> names = new ArrayList<>();
            ArrayList<Integer> ages = new ArrayList<>();

            // Get the records
            List<CSVRecord> records = parser.getRecords();

            // Process the records and populate additional data structures
            for (CSVRecord record : records) {
                names.add(record.get(0));
                ages.add(Integer.parseInt(record.get(1)));
            }

            // Use read method on the first record
            /* read */ boolean isConsistent = records.get(0).isConsistent();
            System.out.println("Is the first record consistent? " + isConsistent);

            // Print the names and ages
            for (int i = 0; i < names.size(); i++) {
                System.out.println("Name: " + names.get(i) + ", Age: " + ages.get(i));
            }

            // Additional logic to manipulate and display data
            int totalAge = 0;
            for (int age : ages) {
                totalAge += age;
            }
            System.out.println("Total age: " + totalAge);
            System.out.println("Average age: " + (totalAge / ages.size()));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}