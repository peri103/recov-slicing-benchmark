import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a comment marker
            CSVFormat format = CSVFormat.DEFAULT /* write */.withCommentMarker('#');

            // Prepare a sample CSV input with comments
            String csvData = "# This is a comment\n" +
                             "header1,header2\n" +
                             "value1,value2";

            // Parse the CSV data
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();

            // Assuming the comment is in the first record (as per the sample data)
            /* read */ String comment = records.get(0).getComment();
            
            // Print the comment
            System.out.println(comment);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}