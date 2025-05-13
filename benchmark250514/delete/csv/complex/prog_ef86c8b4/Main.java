import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withNullString("NULL");
        
        // Simulate creating a CSVRecord with the format
        String[] values = {"value1", "NULL", "value3"};
        CSVRecord record = CSVFormat.DEFAULT.parse(values).getRecords().get(0);

        // Additional complexity: Using a HashMap to store CSVRecord values
        Map<String, String> csvDataMap = new HashMap<>();
        for (String value : values) {
            csvDataMap.put(value, value.equals("NULL") ? "null" : value);
        }

        // Perform operations on the map
        for (Map.Entry<String, String> entry : csvDataMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // More operations
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            if (!values[i].equals("NULL")) {
                sum += i;
            }
        }
        System.out.println("Sum of indices of non-null values: " + sum);

        /* read */ boolean isSet = record.isSet("value1");
        System.out.println(isSet);

        // Additional complexity: Manipulating an array
        int[] numbers = {5, 10, 15, 20};
        int product = 1;
        for (int num : numbers) {
            product *= num;
        }
        System.out.println("Product of numbers: " + product);
    }
}