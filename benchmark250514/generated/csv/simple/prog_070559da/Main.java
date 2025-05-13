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
            String csvData = "# This is a comment\nheader1,header2\nvalue1,value2";

            // Create CSVFormat instance and add header comments
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withHeaderComments("This is a comment");

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Read the first record
            List<CSVRecord> records = parser.getRecords();
            CSVRecord record = records.get(0);

            // Retrieve the comment from the record
            /* read */ String comment = record.getComment();
            System.out.println(comment);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}