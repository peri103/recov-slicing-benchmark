import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.QuoteMode;

import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Prepare CSV data with multiple lines and comments
            String csvData = "# This is a comment\nheader1,header2\nvalue1,value2\nvalue3,value4";

            // Create CSVFormat instance and add header comments
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withHeaderComments("This is a comment");

            // Add additional configurations to CSVFormat
            format = format.withQuoteMode(QuoteMode.ALL)
                           .withIgnoreEmptyLines(true);

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Process all records
            List<CSVRecord> records = parser.getRecords();
            for (CSVRecord record : records) {
                // Print each record's values
                System.out.println("Record: " + record.get(0) + ", " + record.get(1));
            }

            // Perform some calculations based on records
            int sum = 0;
            for (CSVRecord record : records) {
                int value1 = Integer.parseInt(record.get(0).replace("value", ""));
                int value2 = Integer.parseInt(record.get(1).replace("value", ""));
                sum += value1 + value2;
            }
            System.out.println("Sum of values: " + sum);

            // Retrieve the comment from the first record
            CSVRecord firstRecord = records.get(0);
            /* read */ String comment = firstRecord.getComment();
            System.out.println(comment);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}