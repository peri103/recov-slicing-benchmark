import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with the method to ignore header case
        CSVFormat csvFormat = CSVFormat.DEFAULT.withIgnoreHeaderCase();

        // Sample CSV data
        String csvData = "Name,Age\nJohn,30\nJane,25";

        try {
            // Parse the CSV data using the CSVFormat
            CSVParser parser = CSVParser.parse(new StringReader(csvData), csvFormat);

            // Assume we are interested in the first record
            CSVRecord record = parser.getRecords().get(0);

            // Additional logic to make the program more complex
            List<String> names = new ArrayList<>();
            List<Integer> ages = new ArrayList<>();

            // Populate names and ages lists from CSV data
            for (CSVRecord rec : parser) {
                String name = rec.get("Name");
                int age = Integer.parseInt(rec.get("Age"));
                names.add(name);
                ages.add(age);
            }

            // Additional processing on the names and ages lists
            for (int i = 0; i < names.size(); i++) {
                String name = names.get(i);
                int age = ages.get(i);
                System.out.println("Processing: " + name + " who is " + age + " years old.");
            }

            // Check if the record is mapped (i.e., has a mapping for the headers)
            /* read */ boolean isMapped = record.isMapped("name");

            // Print the result
            System.out.println("Is 'name' mapped in the record? " + isMapped);

        } catch (IOException e) {
            e.printStackTrace();
        }

        // More complex logic
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);
    }
}