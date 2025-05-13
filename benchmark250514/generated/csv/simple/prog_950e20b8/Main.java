import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Prepare CSV data
            String csvData = "# This is a comment\nName, Age\nJohn, 30\nDoe, 25";

            // Create CSVFormat with header comments
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withHeaderComments("This is a comment");

            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);

            // Get the first record
            List<CSVRecord> records = parser.getRecords();
            CSVRecord record = records.get(0);

            // Read the comment from the CSVRecord
            /* read */ String comment = record.getComment();

            // Print the comment
            System.out.println(comment);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}