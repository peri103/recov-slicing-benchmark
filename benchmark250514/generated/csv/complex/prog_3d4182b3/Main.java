import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize the CSVFormat with a header comment
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withHeaderComments("This is a comment");

        // Create a CSV string with a header and a record
        String csvData = "# This is a comment\nName, Age\nJohn Doe, 30";

        // Use a StringReader to simulate reading from a file
        Reader input = new StringReader(csvData);

        try {
            // Parse the CSV data
            CSVParser parser = new CSVParser(input, format);

            // Initialize a map to store the records
            Map<String, Integer> nameAgeMap = new HashMap<>();

            for (CSVRecord record : parser) {
                // Read the comment from the record
                /* read */ String comment = record.getComment();
                System.out.println(comment);

                // Extract and store data in the map
                String name = record.get("Name");
                int age = Integer.parseInt(record.get("Age"));
                nameAgeMap.put(name, age);
            }

            // Perform operations on the map
            for (Map.Entry<String, Integer> entry : nameAgeMap.entrySet()) {
                System.out.println("Name: " + entry.getKey() + ", Age: " + entry.getValue());
            }

            // Additional logic: calculate average age
            int totalAge = 0;
            for (int age : nameAgeMap.values()) {
                totalAge += age;
            }
            double averageAge = totalAge / (double) nameAgeMap.size();
            System.out.println("Average Age: " + averageAge);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}