import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSVFormat object and set header comments
            CSVFormat format = CSVFormat.DEFAULT
                /* write */ .withHeaderComments("This is a header comment");

            // Sample CSV data
            String csvData = "Name, Age\nJohn Doe, 30\nJane Doe, 25";

            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);

            // Get the records from the parser
            List<CSVRecord> records = parser.getRecords();

            // Additional complex logic: Process records and store in a map
            HashMap<String, Integer> nameToAgeMap = new HashMap<>();
            for (CSVRecord record : records) {
                String name = record.get("Name");
                int age = Integer.parseInt(record.get("Age"));
                nameToAgeMap.put(name, age);
            }

            // Simulate some unrelated complex operations
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                numbers.add(i * 2);
            }

            int sum = 0;
            for (Integer number : numbers) {
                sum += number;
            }

            System.out.println("Sum of numbers: " + sum);

            // Read the comment from the first record
            /* read */ String comment = records.get(0).getComment();

            // Print the comment
            System.out.println("Header Comment: " + comment);

            // Print the name to age map
            System.out.println("Name to Age Map: " + nameToAgeMap);

            // Close the parser
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}