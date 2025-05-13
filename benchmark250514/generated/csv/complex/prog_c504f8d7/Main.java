import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with write method
        CSVFormat csvFormat = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces(true);

        // Create a CSV string to parse
        String csvData = "name, age\nJohn Doe, 30";

        // Parse the CSV string using the format
        List<CSVRecord> records = null;
        try {
            records = csvFormat.parse(new StringReader(csvData)).getRecords();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Additional unrelated code to increase complexity
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);

        // More complex logic with a different API
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        for (String name : names) {
            System.out.println("Processing name: " + name);
            if (name.startsWith("A")) {
                System.out.println(name + " starts with A");
            }
        }

        // Ensure the records are parsed
        if (records != null && !records.isEmpty()) {
            CSVRecord record = records.get(0);

            // More unrelated operations
            String[] fruits = {"Apple", "Banana", "Cherry"};
            for (String fruit : fruits) {
                System.out.println("Fruit: " + fruit);
            }

            // Use the read method
            /* read */ boolean isSet = record.isSet("name");
            System.out.println("Is 'name' set: " + isSet);

            // Further logic using the records
            for (CSVRecord rec : records) {
                String name = rec.get("name");
                String age = rec.get("age");
                System.out.println("Name: " + name + ", Age: " + age);
            }
        }
    }
}