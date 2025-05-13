import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header comments
            CSVFormat format = CSVFormat.DEFAULT
                /* write */ .withHeaderComments("This is a comment");

            // Prepare a CSV input string
            String csvData = "header1,header2\nvalue1,value2";

            // Parse the CSV data using the format with header comments
            CSVParser parser = new CSVParser(new StringReader(csvData), format);

            // Retrieve the first record
            List<CSVRecord> records = parser.getRecords();
            CSVRecord record = records.get(0);

            // Read the comment from the record
            /* read */ String comment = record.getComment();

            // Print the comment
            System.out.println(comment);

            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}