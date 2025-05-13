import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.List;
import java.io.StringReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Prepare CSV data with header comments
            String csvData = "# This is a header comment\nHeader1,Header2\nValue1,Value2";
            
            // Create CSVFormat instance with header comments
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withHeaderComments("This is a header comment");
            
            // Parse the CSV data
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();
            
            // Read the comment from the first record (header comment)
            /* read */ String comment = records.get(0).getComment();
            
            System.out.println(comment);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}