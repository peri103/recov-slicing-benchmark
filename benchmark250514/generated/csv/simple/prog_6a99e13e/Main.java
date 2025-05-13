import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSV format with comment marker
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
            
            // Prepare a CSV string with comments
            String csvData = "# This is a comment\nheader1,header2\nvalue1,value2";
            
            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();
            
            // Retrieve the comment from the first record
            /* read */ String comment = records.get(0).getComment();
            
            // Print the comment
            System.out.println(comment);
            
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}