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
            // Initialize CSVFormat with header comments
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withHeaderComments("This is a comment");

            // Prepare a sample CSV data with different quote modes
            CSVFormat formatWithQuotes = CSVFormat.DEFAULT.withQuoteMode(QuoteMode.ALL);
            String csvDataWithQuotes = "\"header1\",\"header2\"\n\"value1\",\"value2\"";
            CSVParser parserWithQuotes = CSVParser.parse(new StringReader(csvDataWithQuotes), formatWithQuotes);
            List<CSVRecord> recordsWithQuotes = parserWithQuotes.getRecords();

            // Print records with quotes
            for (CSVRecord recordWithQuotes : recordsWithQuotes) {
                System.out.println(recordWithQuotes);
            }

            // Prepare a sample CSV data
            String csvData = "# This is a comment\nheader1,header2\nvalue1,value2";

            // Parse the CSV data using the format
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Read the records
            List<CSVRecord> records = parser.getRecords();

            // Perform some operations on records
            for (CSVRecord record : records) {
                System.out.println("Record: " + record);
                for (String value : record) {
                    System.out.println("Value: " + value);
                }
            }

            // Get the first record (assuming it exists)
            CSVRecord record = records.get(0);

            // Read the comment from the record
            /* read */ String comment = record.getComment();

            // Print the comment
            System.out.println("Comment: " + comment);

            // Additional operations with other CSV formats
            CSVFormat formatWithoutHeader = CSVFormat.DEFAULT.withHeader();
            String csvDataWithoutHeader = "value1,value2,value3";
            CSVParser parserWithoutHeader = CSVParser.parse(new StringReader(csvDataWithoutHeader), formatWithoutHeader);
            List<CSVRecord> recordsWithoutHeader = parserWithoutHeader.getRecords();

            // Print records without header
            for (CSVRecord recordWithoutHeader : recordsWithoutHeader) {
                System.out.println(recordWithoutHeader);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}