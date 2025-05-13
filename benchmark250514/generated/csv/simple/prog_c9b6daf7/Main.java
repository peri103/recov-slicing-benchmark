import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a comment marker
            CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
            /* write */ format = format.withCommentMarker('#');

            // Prepare a sample CSV data with a comment
            String csvData = "# This is a comment\nheader1,header2\nvalue1,value2";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();

            // Read the comment from the CSVRecord
            /* read */ String comment = records.get(0).getComment();

            // Print the comment
            System.out.println(comment);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}