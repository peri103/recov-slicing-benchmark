import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat and apply withTrailingDelimiter
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withTrailingDelimiter();

            // Create a sample CSV input
            String csvData = "Name,Age\nJohn,30\nJane,25\n";

            // Parse the CSV data using the format
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Create an ArrayList to store CSVRecords
            ArrayList<CSVRecord> recordsList = new ArrayList<>(parser.getRecords());

            // Create a HashMap to store names and ages
            HashMap<String, Integer> nameAgeMap = new HashMap<>();

            // Add records to the HashMap
            for (CSVRecord record : recordsList) {
                String name = record.get("Name");
                int age = Integer.parseInt(record.get("Age"));
                nameAgeMap.put(name, age);
            }

            // Perform some operations on the HashMap
            for (String name : nameAgeMap.keySet()) {
                System.out.println(name + " is " + nameAgeMap.get(name) + " years old.");
            }

            // Read the first record
            CSVRecord record = parser.getRecords().get(0);

            // Check if a specific field is set
            /* read */ boolean isSet = record.isSet("Name");

            // Output the result
            System.out.println("Is 'Name' set in the record? " + isSet);

            // Additional operations
            int totalAge = 0;
            for (int age : nameAgeMap.values()) {
                totalAge += age;
            }
            System.out.println("Total age of all persons: " + totalAge);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}