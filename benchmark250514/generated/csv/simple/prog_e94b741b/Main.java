import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header comments
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withHeaderComments("This is a header comment");

            // Create a sample CSV string
            String csvData = "name,age\nJohn,30\nJane,25";

            // Parse the CSV data
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();

            // Access the comment from the first record
            /* read */ String comment = records.get(0).getComment();

            // Print the retrieved comment
            System.out.println(comment);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}