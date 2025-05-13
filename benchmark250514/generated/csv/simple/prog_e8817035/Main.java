import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSVFormat instance with a comment marker
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
            
            // Simulate reading a CSV record with a comment
            String csvData = "# This is a comment\nvalue1,value2,value3";
            CSVParser parser = CSVParser.parse(csvData, format);
            List<CSVRecord> records = parser.getRecords();
            
            // Assuming the first record is the comment line
            CSVRecord commentRecord = records.get(0);
            /* read */ String comment = commentRecord.getComment();
            
            // Print the comment
            System.out.println(comment);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}