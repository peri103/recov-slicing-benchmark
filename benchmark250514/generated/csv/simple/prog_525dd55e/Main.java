import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a comment marker
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withCommentMarker('#');

            // Create a sample CSV input with a comment
            String csvData = "# This is a comment\nHeader1,Header2\nValue1,Value2";
            StringReader reader = new StringReader(csvData);

            // Parse the CSV data
            List<CSVRecord> records = format.parse(reader).getRecords();

            // Read the comment from the first record
            /* read */ String comment = records.get(0).getComment();
            System.out.println("Comment: " + comment);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}