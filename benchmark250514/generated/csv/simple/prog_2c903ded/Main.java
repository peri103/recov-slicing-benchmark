import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import java.util.Arrays;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header comments
            /* write */ CSVFormat csvFormat = CSVFormat.DEFAULT.withHeaderComments("This is a comment");

            // Prepare a sample CSV data
            String csvData = "name,age\nJohn,30\nDoe,25";
            StringReader reader = new StringReader(csvData);

            // Parse the CSV data
            List<CSVRecord> records = csvFormat.parse(reader).getRecords();

            // Read the comment from the first record
            /* read */ String comment = records.get(0).getComment();

            // Output the comment
            System.out.println(comment);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}