import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSV format with header comments
            CSVFormat format = CSVFormat.DEFAULT
                    /* write */ .withHeaderComments("This is a comment");

            // Simulate a CSV input to parse
            String csvData = "# This is a comment\nHeader1,Header2\nvalue1,value2";
            CSVParser parser = new CSVParser(new StringReader(csvData), format);

            // Read the first record
            List<CSVRecord> records = parser.getRecords();
            CSVRecord record = records.get(0);
            /* read */ String comment = record.getComment();

            System.out.println(comment);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}