import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header comments
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withHeaderComments("This is a comment");

            // Create a sample CSV content
            String csvContent = "Name, Age\nAlice, 30\nBob, 25";

            // Parse the CSV content
            CSVParser parser = CSVParser.parse(csvContent, format);

            // Get the records from the parser
            List<CSVRecord> records = parser.getRecords();

            // Read the comment from the first record
            /* read */ String comment = records.get(0).getComment();

            // Print the comment
            System.out.println(comment);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}