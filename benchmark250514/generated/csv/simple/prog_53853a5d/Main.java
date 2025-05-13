import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header comments
            /* write */ CSVFormat csvFormat = CSVFormat.DEFAULT.withHeaderComments("This is a comment");

            // Simulate reading a CSV record
            String csvData = "# This is a comment\nheader1,header2\nvalue1,value2";
            StringReader reader = new StringReader(csvData);
            List<CSVRecord> records = csvFormat.parse(reader).getRecords();
            
            if (!records.isEmpty()) {
                CSVRecord record = records.get(0);
                // Read the comment from the CSVRecord
                /* read */ String comment = record.getComment();
                System.out.println(comment);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}