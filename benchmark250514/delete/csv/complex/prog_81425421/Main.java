import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize the CSVFormat object with a specific delimiter
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withDelimiter(';');

        // Unrelated complex code: Working with a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);

        // Simulate a CSVRecord using the format with the delimiter
        // Here we use a simple string to demonstrate the read operation
        // In a real scenario, CSVRecord would be obtained from parsing a CSV file
        String csvData = "value1;value2;value3";
        CSVRecord record = format.parse(csvData).getRecords().get(0);

        // More unrelated complex code: Manipulating a list of strings
        List<String> strings = Arrays.asList("apple", "banana", "cherry");
        for (String str : strings) {
            System.out.println("Fruit: " + str);
        }

        // Read the CSVRecord
        /* read */ String recordString = record.toString();

        // Output the result
        System.out.println(recordString);

        // Additional complex code: Using a loop to perform calculations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers 1 to 5: " + product);
    }
}