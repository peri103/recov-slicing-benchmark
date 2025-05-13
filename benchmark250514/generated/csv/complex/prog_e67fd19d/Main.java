import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSV format with a specific delimiter
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withDelimiter(';');

            // Example CSV data
            String csvData = "name;age;city\nJohn;30;New York\nAlice;25;Los Angeles";

            // Parse the CSV data using the format with the specified delimiter
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Create a map to store CSV records by name
            Map<String, CSVRecord> recordMap = new HashMap<>();

            // Iterate through records and store them in the map
            for (CSVRecord rec : parser.getRecords()) {
                String name = rec.get(0); // assuming first column is name
                recordMap.put(name, rec);
            }

            // Retrieve a specific record from the map
            CSVRecord johnRecord = recordMap.get("John");

            // Additional unrelated logic to make the program more complex
            int sumOfAges = 0;
            for (CSVRecord rec : parser.getRecords()) {
                sumOfAges += Integer.parseInt(rec.get(1)); // assuming second column is age
            }
            System.out.println("Sum of ages: " + sumOfAges);

            // Read the record as a string
            /* read */ String recordString = johnRecord.toString();
            System.out.println(recordString);

            // More complex logic with unrelated operations
            int maxAge = Integer.MIN_VALUE;
            for (CSVRecord rec : parser.getRecords()) {
                int age = Integer.parseInt(rec.get(1));
                if (age > maxAge) {
                    maxAge = age;
                }
            }
            System.out.println("Max age: " + maxAge);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}