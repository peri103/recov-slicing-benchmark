import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSV format instance with header comments
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withHeaderComments("This is a comment");

            // Prepare a CSV string to parse
            String csvData = "id,name\n1,John Doe";

            // Parse the CSV data using the format
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Get the first record
            CSVRecord record = parser.getRecords().get(0);

            // Read the comment from the record
            /* read */ String comment = record.getComment();

            // Print the comment
            System.out.println(comment);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}