import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize the CSVFormat with header comments
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withHeaderComments("This is a header comment");

            // Sample CSV data
            String csvData = "Name, Age\nJohn, 30\nJane, 25";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Create a HashMap to store records by name
            HashMap<String, Integer> nameToAgeMap = new HashMap<>();

            // Get the records from the parser
            List<CSVRecord> records = parser.getRecords();

            // Process each record and store in HashMap
            for (CSVRecord record : records) {
                String name = record.get("Name");
                int age = Integer.parseInt(record.get("Age"));
                nameToAgeMap.put(name, age);
            }

            // Create an ArrayList to store names
            ArrayList<String> namesList = new ArrayList<>(nameToAgeMap.keySet());

            // Perform some operations on the names list
            for (String name : namesList) {
                System.out.println("Name: " + name + ", Age: " + nameToAgeMap.get(name));
            }

            // Read the header comment from the first record
            /* read */ String comment = records.get(0).getComment();
            System.out.println("Header Comment: " + comment);

            // Additional operations to make the program more complex
            int totalAge = 0;
            for (int age : nameToAgeMap.values()) {
                totalAge += age;
            }
            System.out.println("Total Age: " + totalAge);

            // Sort names list and print sorted names
            namesList.sort(String::compareTo);
            System.out.println("Sorted Names: " + namesList);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}