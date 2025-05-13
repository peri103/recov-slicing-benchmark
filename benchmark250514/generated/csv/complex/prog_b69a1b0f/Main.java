import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a specific delimiter
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withDelimiter(';');

            // Simulate unrelated operations
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int i = 1; i <= 5; i++) {
                numbers.add(i * 10);
            }

            HashMap<String, String> userInfo = new HashMap<>();
            userInfo.put("name", "Alice");
            userInfo.put("age", "25");
            userInfo.put("country", "Canada");

            for (String key : userInfo.keySet()) {
                System.out.println(key + ": " + userInfo.get(key));
            }

            // Sample data using the specified format
            String csvData = "name;age;location\nJohn Doe;30;USA";

            // Parse the CSV data
            Iterable<CSVRecord> records = format.parse(new StringReader(csvData));

            // More unrelated operations
            ArrayList<String> cities = new ArrayList<>();
            cities.add("New York");
            cities.add("Los Angeles");
            cities.add("Chicago");
            for (String city : cities) {
                System.out.println("City: " + city);
            }

            // Read the first record and convert it to a string
            for (CSVRecord record : records) {
                // Perform some unrelated computation
                int sum = 0;
                for (int number : numbers) {
                    sum += number;
                }
                System.out.println("Sum of numbers: " + sum);

                /* read */ String recordString = record.toString();
                System.out.println(recordString);
                break; // Ensure read method is executed only once
            }

            // Additional unrelated computation
            int product = 1;
            for (int number : numbers) {
                product *= number;
            }
            System.out.println("Product of numbers: " + product);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}