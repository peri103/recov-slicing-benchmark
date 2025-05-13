import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a comment marker
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');

            // Create a sample CSV data with a comment
            String csvData = "#This is a comment\nname,age\nJohn,30\nDoe,25";
            
            // Parse the CSV data
            List<CSVRecord> records = format.parse(new java.io.StringReader(csvData)).getRecords();

            // Read the comment from the first record
            /* read */ String comment = records.get(0).getComment();

            // Print the comment
            System.out.println(comment);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}