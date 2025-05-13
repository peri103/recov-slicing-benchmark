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
            // Initialize CSVFormat with ignoring surrounding spaces
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces(true);

            // Sample CSV data
            String csvData = "name, age\nJohn Doe, 30\nJane Doe, 25";

            // Parse CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();

            // Additional functionality: Process CSV records into a list of names
            ArrayList<String> names = new ArrayList<>();
            for (CSVRecord record : records) {
                String name = record.get(0);
                names.add(name);
            }

            // Perform some operations on the list of names
            for (String name : names) {
                System.out.println("Processing name: " + name);
            }

            // Check the consistency of the first record
            /* read */ boolean isConsistent = records.get(0).isConsistent();
            System.out.println("Is the first record consistent? " + isConsistent);

            // Additional functionality: Calculate average age from the CSV data
            int totalAge = 0;
            int count = 0;
            for (CSVRecord record : records) {
                int age = Integer.parseInt(record.get(1));
                totalAge += age;
                count++;
            }
            double averageAge = (double) totalAge / count;
            System.out.println("Average age: " + averageAge);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}