import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with a specific null string
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withNullString("NULL");

        // Create a mock CSVRecord for demonstration purposes
        String[] data = {"value1", "NULL", "value3"};
        CSVRecord record = CSVFormat.DEFAULT.parse(java.util.Arrays.asList(data)).iterator().next();

        // Additional complex code
        HashMap<String, Integer> map = new HashMap<>();
        map.put("key1", 10);
        map.put("key2", 20);
        map.put("key3", 30);

        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        int sum = 0;
        for (Integer value : map.values()) {
            sum += value;
        }
        System.out.println("Sum of values: " + sum);

        // Check if a specific index is set in the CSVRecord
        /* read */ boolean isSet = record.isSet(1);
        System.out.println(isSet);

        // Additional complex code
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers 1 to 5: " + product);

        String[] moreData = {"extra1", "extra2", "extra3"};
        for (String str : moreData) {
            System.out.println("Processing: " + str);
        }
    }
}