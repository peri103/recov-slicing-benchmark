import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header comments
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withHeaderComments("This is a comment");

            // Create a CSV string to parse
            String csvData = "Name, Age\nJohn, 30\nJane, 25";

            // Parse the CSV string
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Perform some unrelated operations
            List<String> names = new ArrayList<>();
            names.add("Alice");
            names.add("Bob");
            names.add("Charlie");

            for (String name : names) {
                System.out.println("Processing name: " + name);
            }

            // More unrelated operations
            int sum = 0;
            for (int i = 1; i <= 10; i++) {
                sum += i;
            }
            System.out.println("Sum of numbers from 1 to 10 is: " + sum);

            // Retrieve the first record
            List<CSVRecord> records = parser.getRecords();
            CSVRecord record = records.get(0);

            // Even more unrelated operations
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                numbers.add(i * 2);
            }
            for (int num : numbers) {
                System.out.println("Number: " + num);
            }

            // Read the comment from the record
            /* read */ String comment = record.getComment();
            System.out.println("CSV Comment: " + comment);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}