import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a comment marker
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withCommentMarker('#');

            // Prepare a CSV string with a comment
            String csvData = "#This is a comment\nheader1,header2\nvalue1,value2";

            // Parse the CSV string
            CSVParser parser = new CSVParser(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();

            // Additional complex operations
            ArrayList<String> headers = new ArrayList<>();
            headers.add("header1");
            headers.add("header2");
            
            // Add more data processing
            for (CSVRecord record : records) {
                for (String header : headers) {
                    System.out.println("Value for " + header + ": " + record.get(header));
                }
            }

            // Perform some unrelated computations
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
            }
            System.out.println("Sum of first 10 numbers: " + sum);

            // Read the comment from the first record
            /* read */ String comment = records.get(0).getComment();
            System.out.println(comment);

            // More unrelated computations
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                numbers.add(i * 10);
            }
            for (int i = 0; i < numbers.size(); i++) {
                System.out.println("Number: " + numbers.get(i));
            }

            parser.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}