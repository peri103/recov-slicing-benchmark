import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a header comment
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withHeaderComments("This is a comment");

            // Create a CSV string with a header and a single record
            String csvData = "# This is a comment\nheader1,header2\nvalue1,value2";

            // Parse the CSV string
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();

            // Perform some unrelated operations to make the program more complex
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                numbers.add(i * 2);
            }
            
            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            System.out.println("Sum of numbers: " + sum);

            // Retrieve the first record
            CSVRecord record = records.get(0);

            // More unrelated operations
            List<String> words = new ArrayList<>();
            words.add("Hello");
            words.add("World");
            StringBuilder sentence = new StringBuilder();
            for (String word : words) {
                sentence.append(word).append(" ");
            }
            System.out.println(sentence.toString().trim());

            // Get the comment from the record
            /* read */ String comment = record.getComment();
            System.out.println("CSV Comment: " + comment);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}