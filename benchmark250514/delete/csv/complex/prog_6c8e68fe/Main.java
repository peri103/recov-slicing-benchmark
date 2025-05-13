import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with a null string setting
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withNullString("NULL");

        // Create a sample CSVRecord for demonstration
        String[] values = {"value1", "NULL", "value3"};
        CSVRecord record = CSVFormat.DEFAULT.parse(values).get(0);

        // Unrelated complex code
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
            if (i % 2 == 0) {
                System.out.println("Even number: " + i);
            } else {
                System.out.println("Odd number: " + i);
            }
        }

        // More complex logic
        int[] numbers = {5, 10, 15, 20};
        int product = 1;
        for (int num : numbers) {
            product *= num;
        }
        System.out.println("Product of numbers: " + product);

        // Check if a specific index is set in the CSVRecord
        /* read */ boolean isSet = record.isSet(1);
        
        // Output the result
        System.out.println("Is index 1 set: " + isSet);

        // Additional unrelated logic
        String message = "Complexity increased!";
        for (char ch : message.toCharArray()) {
            System.out.print(ch + " ");
        }
        System.out.println();
    }
}