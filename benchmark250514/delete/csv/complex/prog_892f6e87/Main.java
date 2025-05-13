import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with header comments
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withHeaderComments("This is a header comment");

        // Unrelated code to make the program more complex
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        HashMap<String, Integer> nameLengths = new HashMap<>();
        for (String name : names) {
            nameLengths.put(name, name.length());
        }

        for (String key : nameLengths.keySet()) {
            System.out.println("Name: " + key + ", Length: " + nameLengths.get(key));
        }

        // Simulate reading the comment from a CSVRecord
        // Normally, we'd parse a CSV file to get a CSVRecord, but since file operations are not allowed,
        // we'll simulate this by creating a CSVRecord manually with the expected comment.
        CSVRecord record = new CSVRecord(null, null, null, 0, format);
        /* read */ String comment = record.getComment();
        
        // Print the comment
        System.out.println(comment);

        // Additional complex logic
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            numbers.add(i * i);
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of squares: " + sum);
    }
}