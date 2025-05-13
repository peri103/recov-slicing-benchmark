import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header comments
            CSVFormat format = CSVFormat.DEFAULT.withHeaderComments("This is a comment");
            
            // Create a sample CSV input
            String csvData = "name,age\nJohn,30\nJane,25";
            
            // Parse the CSV data using the format with header comments
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            
            // Retrieve the first record
            List<CSVRecord> records = parser.getRecords();
            CSVRecord firstRecord = records.get(0);
            
            // Read the comment from the first record
            /* read */ String comment = firstRecord.getComment();
            
            // Output the comment
            System.out.println(comment);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}