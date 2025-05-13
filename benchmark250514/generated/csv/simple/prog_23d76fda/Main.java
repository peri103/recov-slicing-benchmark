import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            // Prepare a sample CSV input
            String csvData = "#This is a comment\nheader1,header2\nvalue1,value2";

            // Create a CSVFormat instance with a comment marker using withCommentMarker
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');

            // Parse the CSV data
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();

            // Read the comment from the first record
            /* read */ String comment = records.get(0).getComment();

            // Print the comment
            System.out.println(comment);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}