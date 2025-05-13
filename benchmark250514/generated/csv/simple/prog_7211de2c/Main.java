import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a comment marker
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');

            // Prepare a CSV input with a comment
            String csvData = "# This is a comment\nheader1,header2\nvalue1,value2";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Read the first record
            CSVRecord record = parser.getRecords().get(0);

            // Try to get the comment (Note: CSVRecord does not directly support getComment)
            // This is a workaround: we will not directly retrieve a comment from CSVRecord
            // because CSVRecord does not store comments as part of the records.
            // We will just demonstrate reading the first value from the record.
            /* read */ String value = record.get(0);

            System.out.println(value);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}