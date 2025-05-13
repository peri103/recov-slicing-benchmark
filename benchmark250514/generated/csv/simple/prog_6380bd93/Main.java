import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.List;
import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a comment marker
            CSVFormat format = CSVFormat.DEFAULT /* write */ .withCommentMarker('#');
            
            // Sample CSV data with a comment
            String csvData = "# This is a comment\nname,age\nJohn,30\nDoe,25";
            
            // Parse the CSV data
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();
            
            // Read the comment from the first record (which is the comment line)
            String comment = records.get(0) /* read */ .getComment();
            
            // Output the comment
            System.out.println(comment);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}