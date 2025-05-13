import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVWriter and add header comment
            CSVWriter writer = new CSVWriter();
            writer.addHeaderComment("This is a comment");

            // Prepare a CSV input with header and a row
            String csvData = "# This is a comment\nheader1,header2\nvalue1,value2";
            StringReader reader = new StringReader(csvData);

            // Parse the CSV data
            CSVParser parser = new CSVParser(reader, writer.getFormat());

            // Create a list of CSV records
            List<CSVRecord> records = new ArrayList<>(parser.getRecords());

            // Initialize CSVReader with records
            CSVReader csvReader = new CSVReader(records);

            // Additional code: Process each CSV record
            for (CSVRecord record : csvReader.getRecords()) {
                System.out.println("Record: " + record);
            }

            // Additional code: Calculate the sum of values in the first column
            int sum = 0;
            for (CSVRecord record : csvReader.getRecords()) {
                try {
                    sum += Integer.parseInt(record.get(0));
                } catch (NumberFormatException e) {
                    // Ignore non-integer values
                }
            }
            System.out.println("Sum of first column: " + sum);

            // Read the comment using CSVReader
            String comment = csvReader.readCommentFromFirstRecord();

            // Output the comment
            System.out.println(comment);

            // Additional code: Output the number of records
            System.out.println("Total records: " + csvReader.getRecords().size());

            // Close the parser
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}