import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with the write method
        /* write */ CSVFormat csvFormat = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces(true);

        // Unrelated code block to make the program more complex
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 10);
        }

        HashMap<String, Integer> map = new HashMap<>();
        map.put("John", 30);
        map.put("Jane", 25);

        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

        // More unrelated code
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);

        // Parse the CSV data using the configured CSVFormat
        String csvData = "name, age\nJohn Doe, 30\nJane Doe, 25";
        try {
            CSVParser parser = CSVParser.parse(new StringReader(csvData), csvFormat);
            
            for (CSVRecord record : parser) {
                // Intermediate operations
                String name = record.get(0);
                String age = record.get(1);
                System.out.println("Name: " + name + ", Age: " + age);

                // Read the consistency of each record
                /* read */ boolean isConsistent = record.isConsistent();
                System.out.println("Record is consistent: " + isConsistent);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Additional unrelated logic
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");

        for (String name : names) {
            System.out.println("Hello, " + name);
        }
    }
}