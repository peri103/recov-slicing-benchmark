import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a comment marker
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');

            // Example CSV data with a comment
            String csvData = "#This is a comment\nheader1,header2\nvalue1,value2";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(csvData, format);

            // Get the records
            List<CSVRecord> records = parser.getRecords();

            // Iterate through records and read the comment
            for (CSVRecord record : records) {
                /* read */ String comment = record.getComment();
                if (comment != null) {
                    System.out.println("Comment: " + comment);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}