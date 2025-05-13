import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.StringReader;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header comments
            CSVFormat format = CSVFormat.DEFAULT.withHeaderComments("This is a comment");
            
            // Prepare a CSV string to parse
            String csvData = "# This is a comment\nheader1,header2\nvalue1,value2";
            
            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            
            // Retrieve the records
            List<CSVRecord> records = parser.getRecords();
            
            // Assuming the first record contains the data
            CSVRecord record = records.get(0);
            
            // Read the comment
            /* read */ String comment = record.getComment();
            
            // Print the comment
            System.out.println(comment);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}