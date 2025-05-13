import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Sample CSV data including a comment
            String csvData = "# This is a comment\nheader1,header2\nvalue1,value2";

            // Use CSVCommentHandler to parse CSV data
            CSVCommentHandler commentHandler = new CSVCommentHandler();
            List<CSVRecord> records = commentHandler.parseCSV(csvData);

            // Process CSV records
            CSVProcessor processor = new CSVProcessor(records);
            List<String> headers = processor.extractHeaders();
            for (String header : headers) {
                System.out.println("Header: " + header);
            }

            // Unrelated logic
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
            }
            System.out.println("Sum of numbers from 0 to 9: " + sum);

            // Output the comment
            String comment = processor.getFirstComment();
            System.out.println("Comment: " + comment);

            // More complex operations
            List<String> values = processor.extractValues();
            for (String value : values) {
                System.out.println("Value: " + value);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}