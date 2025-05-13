import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with comment marker
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
            
            // Sample CSV data with comments
            String csvData = "# This is a comment\nName,Age\nJohn,30\n# Another comment\nDoe,25";
            
            // Parse CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();
            
            // Retrieve the comment from the first record
            /* read */ String comment = records.get(0).getComment();
            
            System.out.println("Comment: " + comment);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}