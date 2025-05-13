import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with a quote character
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withQuote('"');

        // Create a CSVRecord for demonstration
        String[] data = {"value1", "value2"};
        CSVRecord record = new CSVRecord(null, data, null, 0, 0);

        // Additional complex code
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");

        HashMap<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);

        for (String str : list) {
            map.put(str, str.length());
        }

        int sumOfLengths = 0;
        for (int length : map.values()) {
            sumOfLengths += length;
        }

        System.out.println("Sum of lengths: " + sumOfLengths);

        // Use the read method to convert the CSVRecord to a string
        /* read */ String recordString = record.toString();
        System.out.println(recordString);

        // Further complex operations
        ArrayList<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numberList.add(i * 2);
        }

        int product = 1;
        for (int num : numberList) {
            product *= num;
        }

        System.out.println("Product of numbers: " + product);
    }
}