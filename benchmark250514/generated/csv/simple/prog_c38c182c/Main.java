import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header comments
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withHeaderComments("This is a comment");

            // Prepare a sample CSV input
            String csvData = "# This is a comment\nHeader1,Header2\nValue1,Value2";

            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);

            // Retrieve the first record
            CSVRecord record = parser.getRecords().get(0);

            // Read the comment from the record
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