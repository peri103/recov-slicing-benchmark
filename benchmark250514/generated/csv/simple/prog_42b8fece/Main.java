import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Simulating CSV data with a comment
        String csvData = "# This is a comment\nName,Age\nJohn,30";

        try {
            // Initialize CSVFormat with comment marker
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withCommentMarker('#');

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();

            // Retrieve the comment
            /* read */ String comment = records.get(0).getComment();
            System.out.println(comment); // Output the comment

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}