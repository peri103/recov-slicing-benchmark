import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSVFormat instance with header comments
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withHeaderComments("This is a header comment");

            // Prepare a CSV string to parse
            String csvData = "# This is a header comment\nheader1,header2\nvalue1,value2\n";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Get the first record
            List<CSVRecord> records = parser.getRecords();
            CSVRecord record = records.get(0);

            // Retrieve the comment from the record
            /* read */ String comment = record.getComment();

            // Print the comment
            System.out.println(comment);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}