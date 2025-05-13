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
            // Create a CSVFormat instance with a comment marker
            CSVFormat format = CSVFormat.DEFAULT /* write */ .withCommentMarker('#');

            // Define a CSV string with comments
            String csvData = "# This is a comment\nheader1,header2\nvalue1,value2";

            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Create another CSVFormat instance with different settings
            CSVFormat formatWithQuote = CSVFormat.DEFAULT.withQuoteMode(QuoteMode.ALL);

            // Define a CSV string with quotes
            String quotedCsvData = "\"header1\",\"header2\"\n\"value1\",\"value2\"";

            // Parse the quoted CSV data
            CSVParser quotedParser = CSVParser.parse(new StringReader(quotedCsvData), formatWithQuote);

            // Get the records from the quoted CSV
            List<CSVRecord> quotedRecords = quotedParser.getRecords();

            // Process the quoted records
            for (CSVRecord quotedRecord : quotedRecords) {
                System.out.println("Quoted Record: " + quotedRecord);
            }

            // Get the records from the original CSV
            List<CSVRecord> records = parser.getRecords();

            // Read the comment from the first record
            /* read */ String comment = records.get(0).getComment();

            // Print the comment
            System.out.println(comment);

            // Additional processing on the original records
            for (CSVRecord record : records) {
                for (String value : record) {
                    System.out.println("Value: " + value);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}