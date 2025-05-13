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
            CSVFormat format = CSVFormat.DEFAULT /* write */.withHeaderComments("This is a comment");

            // Creating a sample CSV data
            String csvData = "# This is a comment\nheader1,header2\nvalue1,value2";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();

            // Assuming we are interested in the first record
            CSVRecord record = records.get(0);

            // Read the comment from the record
            /* read */ String comment = record.getComment();

            // Print the comment
            System.out.println(comment);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}