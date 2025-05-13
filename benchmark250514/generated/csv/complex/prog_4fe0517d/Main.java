import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header comments
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withHeaderComments("This is a comment");

            // Create a CSVParser with a single record
            String csvData = "# This is a comment\n" + "header1,header2\n" + "value1,value2\n";
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Simulate unrelated operations
            ArrayList<String> dataList = new ArrayList<>();
            dataList.add("Sample Data 1");
            dataList.add("Sample Data 2");
            dataList.add("Sample Data 3");

            for (String data : dataList) {
                System.out.println("Processing: " + data);
            }

            // More complex operations
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
                System.out.println("Sum till " + i + ": " + sum);
            }

            // Retrieve the first record
            List<CSVRecord> records = parser.getRecords();
            CSVRecord record = records.get(0);

            // Perform operations on CSVRecord
            for (int i = 0; i < record.size(); i++) {
                System.out.println("CSV Record Value at index " + i + ": " + record.get(i));
            }

            // Read the comment
            /* read */ String comment = record.getComment();
            System.out.println("CSV Comment: " + comment);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}