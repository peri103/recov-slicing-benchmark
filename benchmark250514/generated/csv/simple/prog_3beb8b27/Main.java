import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a comment marker
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
            
            // Create a sample CSV content with a comment
            String csvContent = "# This is a comment\nname,age\nJohn,30\nDoe,25";
            
            // Parse the CSV content
            CSVParser parser = CSVParser.parse(csvContent, format);
            List<CSVRecord> records = parser.getRecords();
            
            // Read the comment from the first line
            /* read */ String comment = records.get(0).getComment();
            
            // Output the comment
            System.out.println(comment);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}