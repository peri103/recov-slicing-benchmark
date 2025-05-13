import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header comments
            /* write */
            CSVFormat format = CSVFormat.DEFAULT.withHeaderComments("This is a comment");

            // Create a CSVParser to parse a sample CSV input
            String csvData = "name,age\nJohn,30\nDoe,25";
            CSVParser parser = new CSVParser(new StringReader(csvData), format);

            // Get the first record from the parser
            List<CSVRecord> records = parser.getRecords();
            CSVRecord record = records.get(0);

            // Read the comment from the record
            /* read */
            String comment = record.getComment();
            System.out.println(comment);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}