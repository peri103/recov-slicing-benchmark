import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.util.List;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a custom record separator
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withRecordSeparator(";");

            // Sample CSV data to demonstrate reading
            String csvData = "Name,Age,Location\nJohn,30,USA\nJane,25,UK";

            // Parse the CSV data using the format with the custom record separator
            CSVParser parser = CSVParser.parse(csvData, format);

            // Create a HashMap to store the records with names as keys
            HashMap<String, String> recordMap = new HashMap<>();

            // Retrieve the records and populate the HashMap
            List<CSVRecord> records = parser.getRecords();
            for (CSVRecord rec : records) {
                String name = rec.get(0);
                String details = rec.get(1) + ", " + rec.get(2);
                recordMap.put(name, details);
            }

            // Perform some unrelated operations to make the program more complex
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i * i;
            }
            System.out.println("Sum of squares from 0 to 9: " + sum);

            // Retrieve and print the first record using the original read method
            /* read */ CSVRecord record = records.get(0);
            System.out.println("First record: " + record.toString());

            // Print the stored records from the HashMap
            for (String name : recordMap.keySet()) {
                System.out.println(name + ": " + recordMap.get(name));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}