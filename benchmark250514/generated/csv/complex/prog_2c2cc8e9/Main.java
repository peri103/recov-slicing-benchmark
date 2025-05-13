import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withHeader("Name", "Age", "Country");
            
            // Create a sample CSV data
            String csvData = "Name,Age,Country\nJohn,30,USA\nAlice,25,UK";
            
            // Parse the CSV data
            CSVParser parser = CSVParser.parse(csvData, format);
            
            // Additional operations on CSV data
            List<CSVRecord> records = parser.getRecords();
            for (CSVRecord record : records) {
                String name = record.get("Name");
                String age = record.get("Age");
                String country = record.get("Country");
                System.out.println("Name: " + name + ", Age: " + age + ", Country: " + country);
            }
            
            // Perform some unrelated computations
            int[] numbers = {1, 2, 3, 4, 5};
            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            System.out.println("Sum of numbers: " + sum);

            // Get the first record again
            CSVRecord firstRecord = records.get(0);
            
            // Check if a field is set in the record
            /* read */ boolean isSet = firstRecord.isSet("Name");
            
            // Print the result
            System.out.println("Is 'Name' set in the first record? " + isSet);
            
            // More unrelated computations
            int product = 1;
            for (int num : numbers) {
                product *= num;
            }
            System.out.println("Product of numbers: " + product);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}