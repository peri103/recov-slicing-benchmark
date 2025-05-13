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

            // Sample CSV data
            String csvData = "Name, Age\nJohn, 30\nJane, 25";

            // Parse the CSV data using the format
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Retrieve the records
            List<CSVRecord> records = parser.getRecords();
            
            // Assuming we want to get the comment from the first record
            if (!records.isEmpty()) {
                CSVRecord record = records.get(0);
                /* read */ String comment = record.getComment();
                System.out.println(comment);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}