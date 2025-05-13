import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Prepare CSV content
            String csvContent = "# This is a comment\n" +
                                "header1,header2\n" +
                                "value1,value2\n";
            
            // Create CSVFormat with header comments
            CSVFormat csvFormat = CSVFormat.DEFAULT
                                    /* write */ .withHeaderComments("This is a comment");
            
            // Parse the CSV content
            CSVParser parser = CSVParser.parse(new StringReader(csvContent), csvFormat);
            List<CSVRecord> records = parser.getRecords();
            
            // Read the comment from the first record
            /* read */ String comment = records.get(0).getComment();
            
            // Output the comment
            System.out.println(comment);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}