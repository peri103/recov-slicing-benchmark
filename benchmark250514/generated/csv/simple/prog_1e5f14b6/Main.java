import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Prepare a CSV format with header comments
            CSVFormat format = CSVFormat.DEFAULT
                .withHeaderComments("This is a comment");
            
            // Simulate CSV content
            String csvContent = "# This is a comment\nheader1,header2\nvalue1,value2";

            // Parse the CSV content
            CSVParser parser = CSVParser.parse(new StringReader(csvContent), format);

            // Retrieve the first record
            List<CSVRecord> records = parser.getRecords();
            CSVRecord record = records.get(0);

            // Read the comment from the record
            /* read */ String comment = record.getComment();
            System.out.println(comment);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}