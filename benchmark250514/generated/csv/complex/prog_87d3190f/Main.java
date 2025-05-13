import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the CSV format with header comments
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withHeaderComments("This is a comment");

        // Create a CSV parser with a sample CSV content
        String csvContent = "# This is a comment\nheader1,header2\nvalue1,value2";
        CSVParser parser = null;
        try {
            parser = CSVParser.parse(new StringReader(csvContent), format);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Additional unrelated code to make the program more complex
        ArrayList<String> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        list.add("element1");
        list.add("element2");
        map.put("key1", 100);
        map.put("key2", 200);
        
        for (String element : list) {
            System.out.println("List element: " + element);
        }
        
        for (String key : map.keySet()) {
            System.out.println("Map key: " + key + ", value: " + map.get(key));
        }

        // Read the comment from the first record
        if (parser != null) {
            for (CSVRecord record : parser) {
                /* read */ String comment = record.getComment();
                System.out.println(comment);
                break; // Ensure the read method is executed only once
            }
        }

        // More complex operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 5);
        }
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }
    }
}