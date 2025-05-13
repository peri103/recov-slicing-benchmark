import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header comments
            CSVFormat format = CSVFormat.DEFAULT
                /* write */ .withHeaderComments("This is a comment");

            // Simulate reading a CSV record
            String csvData = "# This is a comment\nheader1,header2\nvalue1,value2";
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();
            CSVRecord record = records.get(0);

            // Read the comment from the CSV record
            /* read */ String comment = record.getComment();
            System.out.println(comment);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}