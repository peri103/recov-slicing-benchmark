import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header comments
            CSVFormat format = CSVFormat.DEFAULT.withHeaderComments("This is a comment");

            // Sample CSV data
            String csvData = "Name,Age\nJohn,30\nJane,25";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(csvData, format);

            // Get the records from the parser
            List<CSVRecord> records = parser.getRecords();

            // Since we added a header comment, it is associated with the first record
            CSVRecord record = records.get(0);

            /* read */ String comment = record.getComment();

            // Print the comment
            System.out.println(comment);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}