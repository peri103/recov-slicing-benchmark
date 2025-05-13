import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with comment marker
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
            
            // Sample CSV data with a comment
            String csvData = "#This is a comment\nheader1,header2\nvalue1,value2";

            // Parse the CSV data
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();

            // Additional code to make the program more complex
            ArrayList<String> headers = new ArrayList<>();
            headers.add("header1");
            headers.add("header2");

            // Process each record to extract values
            for (CSVRecord record : records) {
                for (String header : headers) {
                    String value = record.get(header);
                    System.out.println("Value under " + header + ": " + value);
                }
            }

            // Perform some unrelated computation
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
            }
            System.out.println("Sum of first 10 numbers: " + sum);

            // Read the comment from the first record
            /* read */ String comment = records.get(0).getComment();
            
            // Print the comment
            System.out.println("Comment from CSV: " + comment);

            // More unrelated operations
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                numbers.add(i * 10);
            }
            for (int num : numbers) {
                System.out.println("Number: " + num);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}