import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header comments
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withHeaderComments("This is a header comment");

            // Prepare a CSV string to parse
            String csvData = "header1,header2\nvalue1,value2";

            // Parse the CSV data using the format with header comments
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();

            // Access the first record and read the comment
            CSVRecord record = records.get(0);
            /* read */ String comment = record.getComment();

            // Print the comment
            System.out.println(comment);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}