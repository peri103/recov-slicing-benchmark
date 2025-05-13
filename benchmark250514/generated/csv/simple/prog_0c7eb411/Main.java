import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        // Initialize CSVFormat with a comment marker
        CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');

        // Sample CSV data with a comment
        String csvData = "# This is a comment\n" +
                         "header1,header2\n" +
                         "value1,value2";

        // Parse the CSV data
        List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();

        // Assuming the first record is a comment, read the comment
        /* read */ String comment = records.get(0).getComment();
        
        System.out.println(comment);
    }
}