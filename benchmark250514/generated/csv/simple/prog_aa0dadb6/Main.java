import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import org.apache.commons.csv.CSVParser;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header comments
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withHeaderComments("This is a comment");

            // Sample CSV data
            String csvData = "# This is a comment\nheader1,header2\nvalue1,value2";

            // Parse CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Retrieve the first record
            List<CSVRecord> records = parser.getRecords();
            CSVRecord record = records.get(0); // Assuming there's at least one record

            // Get the comment from the record
            /* read */ String comment = record.getComment();

            // Print the comment
            System.out.println(comment);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}