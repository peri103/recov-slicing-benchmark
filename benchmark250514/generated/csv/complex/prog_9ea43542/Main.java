import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header comments
            /* write */ CSVFormat csvFormat = CSVFormat.DEFAULT.withHeaderComments("This is a comment");

            // Prepare a sample CSV input
            String csvData = "Name, Age\nJohn, 30\nDoe, 25";

            // Parse the CSV data using the format with header comments
            CSVParser parser = CSVParser.parse(new StringReader(csvData), csvFormat);

            // Unrelated complex code: Working with a list of integers
            List<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                numbers.add(i * 2);
            }

            // Some unrelated processing on the list
            int sum = 0;
            for (Integer number : numbers) {
                sum += number;
            }
            System.out.println("Sum of numbers: " + sum);

            // Retrieve the first record
            CSVRecord record = parser.getRecords().get(0);

            // More unrelated complex code: Manipulating strings
            StringBuilder builder = new StringBuilder();
            builder.append("Processed Data:\n");
            for (int i = 0; i < numbers.size(); i++) {
                builder.append("Value " + i + ": " + numbers.get(i) + "\n");
            }
            System.out.println(builder.toString());

            // Read the comment from the CSV record
            /* read */ String comment = record.getComment();

            // Print the comment
            System.out.println(comment);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}