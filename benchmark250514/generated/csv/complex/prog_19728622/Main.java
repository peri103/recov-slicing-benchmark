import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a comment marker
            CSVFormat format = CSVFormat.DEFAULT /* write */.withCommentMarker('#');

            // Sample CSV data including a comment
            String csvData = "# This is a comment\nheader1,header2\nvalue1,value2";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(csvData, format);
            List<CSVRecord> records = parser.getRecords();

            // Additional logic to process CSV records
            ArrayList<String> headers = new ArrayList<>();
            for (CSVRecord record : records) {
                if (record.getComment() == null) {
                    headers.add(record.get(0));
                }
            }
            
            // Additional manipulation of headers
            for (String header : headers) {
                System.out.println("Header: " + header);
            }

            // Unrelated logic
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
            }
            System.out.println("Sum of numbers from 0 to 9: " + sum);

            // Read the comment from the first record
            /* read */ String comment = records.get(0).getComment();

            // Output the comment
            System.out.println("Comment: " + comment);

            // More complex operations
            ArrayList<String> values = new ArrayList<>();
            for (CSVRecord record : records) {
                for (String value : record) {
                    values.add(value);
                }
            }
            
            // Output the values
            for (String value : values) {
                System.out.println("Value: " + value);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}