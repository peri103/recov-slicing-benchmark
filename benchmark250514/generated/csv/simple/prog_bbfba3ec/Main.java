import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header comments
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withHeaderComments("This is a header comment");

            // Prepare a sample CSV content
            String csvContent = "# This is a header comment\n" +
                                "name,age\n" +
                                "Alice,30\n" +
                                "Bob,25";

            // Parse the CSV content
            CSVParser parser = CSVParser.parse(new StringReader(csvContent), format);

            // Get records
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