import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header comments
            /* write */ CSVFormat csvFormat = CSVFormat.DEFAULT.withHeaderComments("This is a header comment");

            // Simulate reading CSV data
            String csvData = "column1,column2\nvalue1,value2";
            CSVParser parser = CSVParser.parse(new StringReader(csvData), csvFormat);
            List<CSVRecord> records = parser.getRecords();

            // Access the first record
            CSVRecord record = records.get(0);

            // Read the header comment
            /* read */ String comment = record.getComment();
            System.out.println(comment);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}