import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        // Initialize CSVFormat with the comment marker
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withCommentMarker('#');

        // Sample CSV data with a comment
        String csvData = "# This is a comment\nheader1,header2\nvalue1,value2";

        // Parse the CSV data
        CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
        List<CSVRecord> records = parser.getRecords();

        // Read the comment from the first record
        /* read */ String comment = records.get(0).getComment();
        System.out.println(comment);
    }
}