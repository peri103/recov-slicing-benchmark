import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with allowing duplicate header names
        CSVFormat csvFormat = CSVFormat.DEFAULT.withAllowDuplicateHeaderNames(true);

        // Create a CSVRecord for demonstration purposes
        // In a real scenario, this would be populated from a CSV file
        String[] headers = {"header1", "header1", "header2"};
        String[] values = {"value1", "value2", "value3"};
        CSVRecord csvRecord = new CSVRecord(headers, values);

        // Write operation
        /* write */ csvFormat = csvFormat.withAllowDuplicateHeaderNames(true);

        // Simulate some additional logic
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);

        // More complex logic
        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("cherry");

        for (String fruit : stringList) {
            System.out.println("Fruit: " + fruit);
        }

        boolean isSet = false;
        // Read operation
        /* read */ isSet = csvRecord.isSet("header1");
        
        System.out.println("Is 'header1' set: " + isSet);

        // Additional operations
        List<String> reversedList = new ArrayList<>();
        for (int i = stringList.size() - 1; i >= 0; i--) {
            reversedList.add(stringList.get(i));
        }

        for (String fruit : reversedList) {
            System.out.println("Reversed Fruit: " + fruit);
        }
    }
}