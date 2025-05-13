import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create CSVFormat with header comments
        CSVFormat format = CSVFormat.DEFAULT /* write */.withHeaderComments("This is a comment");

        String csvData = "# This is a comment\nName, Age\nJohn Doe, 30\nJane Doe, 25";
        
        try {
            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();
            
            // Read the comment from the first record
            /* read */ String comment = records.get(0).getComment();
            System.out.println(comment);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}