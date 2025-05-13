import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSV format with header comments
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withHeaderComments("This is a comment");

            // Prepare a CSV input with header and a row
            String csvData = "# This is a comment\nheader1,header2\nvalue1,value2";
            StringReader reader = new StringReader(csvData);

            // Parse the CSV data
            CSVParser parser = new CSVParser(reader, format);

            // Additional code: Create a list of CSV records
            List<CSVRecord> records = new ArrayList<>(parser.getRecords());

            // Additional code: Process each CSV record
            for (CSVRecord record : records) {
                System.out.println("Record: " + record);
            }

            // Additional code: Calculate the sum of values in the first column
            int sum = 0;
            for (CSVRecord record : records) {
                try {
                    sum += Integer.parseInt(record.get(0));
                } catch (NumberFormatException e) {
                    // Ignore non-integer values
                }
            }
            System.out.println("Sum of first column: " + sum);

            // Read the comment from the first record
            CSVRecord firstRecord = records.get(0);
            /* read */ String comment = firstRecord.getComment();

            // Output the comment
            System.out.println(comment);

            // Additional code: Output the number of records
            System.out.println("Total records: " + records.size());

            // Close the parser
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}