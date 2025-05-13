import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSV format with header comments
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withHeaderComments("This is a comment");

            // Prepare a CSV input with header and a row
            String csvData = "# This is a comment\nheader1,header2\nvalue1,value2";
            StringReader reader = new StringReader(csvData);

            // Parse the CSV data
            CSVParser parser = new CSVParser(reader, format);

            // Read the comment from the first record
            CSVRecord record = parser.getRecords().get(0);
            /* read */ String comment = record.getComment();

            // Output the comment
            System.out.println(comment);

            // Close the parser
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}