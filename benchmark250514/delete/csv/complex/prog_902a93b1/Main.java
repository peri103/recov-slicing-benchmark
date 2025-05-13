import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with a null string representation
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withNullString("NULL");

        // Create a CSVRecord for demonstration
        String[] data = {"value1", "NULL", "value3"};
        CSVRecord record = new CSVRecord(null, data, null, 0, format);

        // Unrelated complex logic with ArrayList
        List<String> stringList = new ArrayList<>(Arrays.asList("apple", "banana", "cherry"));
        for (String fruit : stringList) {
            System.out.println("Fruit: " + fruit);
        }

        // More complex logic with calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // Additional CSVRecord manipulation
        String[] moreData = {"alpha", "beta", "gamma", "NULL"};
        CSVRecord anotherRecord = new CSVRecord(null, moreData, null, 0, format);
        System.out.println("First element in anotherRecord: " + anotherRecord.get(0));

        // Read from the CSVRecord
        /* read */ boolean isSet = record.isSet(1); // Checks if the second element is set
        System.out.println("Is the second element set? " + isSet);

        // Further unrelated logic
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            numbers.add(i * 2);
        }
        for (Integer number : numbers) {
            System.out.println("Number: " + number);
        }
    }
}