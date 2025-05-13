import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSV format with header comments
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withHeaderComments("This is a comment");

            // Prepare a CSV string to parse
            String csvData = "# This is a comment\nheader1,header2\nvalue1,value2";

            // Parse the CSV string using the format with header comments
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Retrieve the first record
            CSVRecord record = parser.getRecords().get(0);

            // Read the comment from the record
            /* read */ String comment = record.getComment();

            // Output the comment
            System.out.println(comment);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}