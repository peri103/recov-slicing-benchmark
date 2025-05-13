import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        // Initialize CSVFormat with header comments
        /* write */ CSVFormat format = CSVFormat.DEFAULT.withHeaderComments("This is a comment");

        // Create a CSVRecord using the format
        String csvData = "header1,header2\nvalue1,value2";
        List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();
        
        // Assuming we want to read the comment from the first record
        CSVRecord record = records.get(0);
        
        // Read the comment from the CSVRecord
        /* read */ String comment = record.getComment();
        
        // Output the comment
        System.out.println(comment);
    }
}