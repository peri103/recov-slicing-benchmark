import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header comments
            /* write */ CSVFormat csvFormat = CSVFormat.DEFAULT.withHeaderComments("This is a comment");

            // Prepare a sample CSV input
            String csvData = "Name, Age\nJohn, 30\nDoe, 25";

            // Parse the CSV data using the format with header comments
            CSVParser parser = CSVParser.parse(new StringReader(csvData), csvFormat);

            // Retrieve the first record
            CSVRecord record = parser.getRecords().get(0);

            // Read the comment from the CSV record
            /* read */ String comment = record.getComment();

            // Print the comment
            System.out.println(comment);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}