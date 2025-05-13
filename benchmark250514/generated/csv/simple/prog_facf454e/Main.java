import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Step 1: Create a CSVFormat object and configure it
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withCommentMarker('#');

            // Step 2: Prepare a CSV string with a comment
            String csvData = "# This is a comment\nname,age\nJohn,30";

            // Step 3: Parse the CSV data
            List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();

            // Step 4: Access the comment from the first record
            /* read */ String comment = records.get(0).getComment();

            // Step 5: Print the comment
            System.out.println(comment);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}