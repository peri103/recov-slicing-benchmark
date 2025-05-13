import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header comments
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withHeaderComments("This is a header comment");

            // Prepare a CSV string to parse
            String csvData = "header1,header2\nvalue1,value2";

            // Simulate a complex operation with another list
            ArrayList<String> extraData = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                extraData.add("Extra Data " + i);
            }

            // Parse the CSV data using the format with header comments
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();

            // Perform some operations on the extra data
            for (String data : extraData) {
                System.out.println("Processing: " + data);
            }

            // Access the first record
            CSVRecord record = records.get(0);

            // Perform some unrelated complex operations
            int sum = 0;
            for (int i = 0; i < 100; i++) {
                sum += i;
            }
            System.out.println("Sum of first 100 numbers: " + sum);

            // Read the comment from the record
            /* read */ String comment = record.getComment();

            // Print the comment
            System.out.println("Comment from CSVRecord: " + comment);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}