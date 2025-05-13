import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with header comments
            CSVFormat format = CSVFormat.DEFAULT /* write */.withHeaderComments("This is a header comment");

            // Create a sample CSV input
            String csvData = "Name, Age\nJohn, 25\nJane, 30";

            // Parse the CSV data using the format
            CSVParser parser = CSVParser.parse(csvData, format);

            // Retrieve the first record from the parser
            List<CSVRecord> records = parser.getRecords();
            CSVRecord record = records.get(0);

            // Read the comment from the record
            /* read */ String comment = record.getComment();

            // Print the retrieved comment
            System.out.println(comment);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}