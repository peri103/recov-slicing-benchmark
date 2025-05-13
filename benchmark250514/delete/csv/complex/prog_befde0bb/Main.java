import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with trailing delimiter
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withTrailingDelimiter();

        // Create a sample CSVRecord for demonstration
        String[] values = {"value1", "value2", "value3"};
        CSVRecord record = new CSVRecord(values, null, format);

        // Complex operations with collections
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");

        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : stringList) {
            wordCount.put(word, word.length());
        }

        // Additional operations on the map
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println("Word: " + entry.getKey() + ", Length: " + entry.getValue());
        }

        // More complex logic
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 natural numbers is: " + sum);

        // Read operation to check if a specific index is set
        /* read */ boolean isSet = record.isSet(1);
        System.out.println("Is index 1 set? " + isSet);

        // Additional logic to manipulate the list
        for (int i = 0; i < stringList.size(); i++) {
            stringList.set(i, stringList.get(i).toUpperCase());
        }

        // Print the modified list
        System.out.println("Modified List: " + stringList);
    }
}