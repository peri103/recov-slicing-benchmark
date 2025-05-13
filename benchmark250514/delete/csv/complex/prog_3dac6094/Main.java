import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with allowDuplicateHeaderNames set to true
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withAllowDuplicateHeaderNames(true);

        // Create a CSVRecord for demonstration purposes
        String[] headers = {"name", "age", "name"};
        String[] values = {"Alice", "30", "Bob"};
        CSVRecord record = CSVRecord.parse(headers, values);

        // Create a map to simulate complex operations
        Map<String, Integer> nameCount = new HashMap<>();
        for (String header : headers) {
            nameCount.put(header, nameCount.getOrDefault(header, 0) + 1);
        }

        // Perform some unrelated complex operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i * i;
        }
        System.out.println("Sum of squares: " + sum);

        // Check if a specific header is set in the record
        /* read */ boolean isSet = record.isSet("name");
        System.out.println("Is 'name' header set: " + isSet);

        // Further operations using the map
        for (Map.Entry<String, Integer> entry : nameCount.entrySet()) {
            System.out.println("Header: " + entry.getKey() + ", Count: " + entry.getValue());
        }

        // Additional complex logic
        int factorial = 1;
        for (int i = 1; i <= 5; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of 5: " + factorial);
    }
}