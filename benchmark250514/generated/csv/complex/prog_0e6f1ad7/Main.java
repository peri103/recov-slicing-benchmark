import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a specific delimiter
            /* write */ CSVFormat csvFormat = CSVFormat.DEFAULT.withDelimiter(';');

            // Create a sample CSV input
            String csvData = "name;age;city\nJohn;30;New York";

            // Parse the CSV data using the CSVFormat with the specified delimiter
            List<CSVRecord> records = csvFormat.parse(new StringReader(csvData)).getRecords();

            // Unrelated code to make the program more complex
            ArrayList<String> cities = new ArrayList<>();
            cities.add("New York");
            cities.add("Los Angeles");
            cities.add("Chicago");

            for (String city : cities) {
                System.out.println("City: " + city);
            }

            // Further unrelated code
            int sum = 0;
            for (int i = 0; i < 5; i++) {
                sum += i;
            }
            System.out.println("Sum of numbers from 0 to 4: " + sum);

            // Access the first record and read its string representation
            /* read */ String recordString = records.get(0).toString();
            System.out.println(recordString);

            // More unrelated code
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int i = 1; i <= 10; i++) {
                numbers.add(i * 2);
            }

            for (int number : numbers) {
                System.out.println("Number: " + number);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}