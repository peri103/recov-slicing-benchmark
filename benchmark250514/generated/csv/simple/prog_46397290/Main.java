import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with header comments
        CSVFormat format = CSVFormat.DEFAULT.withHeaderComments("This is a comment");

        // Simulate reading a record
        String csvData = "column1,column2\nvalue1,value2";
        StringReader reader = new StringReader(csvData);

        try {
            List<CSVRecord> records = format.parse(reader).getRecords();
            CSVRecord record = records.get(0); // Assuming we want the first record

            /* read */ String comment = record.getComment();
            System.out.println(comment);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}