import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.util.List;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header comments
            CSVFormat format = CSVFormat.DEFAULT.withHeaderComments("This is a comment");
            /* write */
            
            // Prepare a sample CSV data
            String csvData = "# This is a comment\nName,Age\nJohn Doe,30\nJane Doe,25";
            StringReader csvReader = new StringReader(csvData);
            
            // Parse the CSV data
            CSVParser parser = new CSVParser(csvReader, format);
            List<CSVRecord> records = parser.getRecords();
            
            // Read the comment from the first record
            /* read */
            String comment = records.get(0).getComment();
            System.out.println(comment);
            
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}