import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Prepare CSV data
            String csvData = "# This is a comment\nHeader1,Header2\nValue1,Value2";

            // Configure CSVFormat with a header comment
            CSVFormat format = CSVFormat.DEFAULT
                    /* write */ .withHeaderComments("This is a comment");

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Retrieve the records
            List<CSVRecord> records = parser.getRecords();

            // Read the comment from the first record
            CSVRecord record = records.get(0);
            /* read */ String comment = record.getComment();

            // Output the comment
            System.out.println(comment);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}