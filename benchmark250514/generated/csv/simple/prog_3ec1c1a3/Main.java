import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSVFormat instance with a comment marker
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');

            // Create a sample CSV input with a comment
            String csvData = "# This is a comment\nheader1,header2\nvalue1,value2";

            // Parse the CSV data
            Iterable<CSVRecord> records = format.parse(new StringReader(csvData));

            // Iterate over the records to find the comment
            Iterator<CSVRecord> iterator = records.iterator();
            CSVRecord record = null;
            while (iterator.hasNext()) {
                record = iterator.next();
                if (record.getComment() != null) {
                    break;
                }
            }

            // Read the comment from the record
            /* read */ String comment = record != null ? record.getComment() : null;

            // Print the comment
            System.out.println(comment);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}