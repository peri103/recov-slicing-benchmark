import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header comments
            CSVFormat format = CSVFormat.DEFAULT
                /* write */ .withHeaderComments("This is a comment");

            // Prepare a sample CSV input to parse
            String csvData = "# This is a comment\nHeader1,Header2\nValue1,Value2";

            // Parse the CSV data
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();

            // Retrieve the comment from the first record
            /* read */ String comment = records.get(0).getComment();

            // Output the comment
            System.out.println(comment);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}