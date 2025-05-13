import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        // Initialize CSVFormat with a comment marker
        CSVFormat format = CSVFormat.DEFAULT /* write */ .withCommentMarker('#');

        // Sample CSV data with a comment
        String csvData = "#This is a comment\nheader1,header2\nvalue1,value2";

        // Parse the CSV data using the format
        CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

        // Read the records
        List<CSVRecord> records = parser.getRecords();

        // Get the comment from the first record
        /* read */ String comment = records.get(0).getComment();

        // Print the comment
        System.out.println(comment);
    }
}