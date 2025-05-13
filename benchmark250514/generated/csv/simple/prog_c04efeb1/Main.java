import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header comments
            CSVFormat csvFormat = CSVFormat.DEFAULT;
            /* write */ csvFormat = csvFormat.withHeaderComments("This is a comment");

            // Prepare a sample CSV data
            String csvData = "# This is a comment\n" +
                             "header1,header2\n" +
                             "value1,value2\n";

            // Parse the CSV data
            List<CSVRecord> records = csvFormat.parse(new StringReader(csvData)).getRecords();

            // Read the comment from the first record
            /* read */ String comment = records.get(0).getComment();
            System.out.println(comment);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}