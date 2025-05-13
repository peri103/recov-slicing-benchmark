import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header comments
            CSVFormat format = CSVFormat.DEFAULT
                /* write */ .withHeaderComments("This is a header comment");

            // Create a sample CSV string
            String csvData = "name,age\nJohn,30\nDoe,25";

            // Parse the CSV data using the format
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Retrieve records from the parser
            List<CSVRecord> records = parser.getRecords();

            // Read the comment from the first record
            /* read */ String comment = records.get(0).getComment();

            // Print the retrieved comment
            System.out.println(comment);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}