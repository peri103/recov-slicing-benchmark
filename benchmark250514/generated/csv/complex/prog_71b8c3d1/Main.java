import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSV format with header comments
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withHeaderComments("This is a comment");

            // Prepare a CSV string to parse
            String csvData = "# This is a comment\nheader1,header2\nvalue1,value2";

            // Parse the CSV string using the format with header comments
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

            // Retrieve all records
            List<CSVRecord> records = parser.getRecords();

            // Perform operations on the records
            List<String> values = new ArrayList<>();
            for (CSVRecord record : records) {
                values.add(record.get(0) + ", " + record.get(1));
            }

            // Output all values
            for (String value : values) {
                System.out.println("Record: " + value);
            }

            // Retrieve the first record
            CSVRecord firstRecord = records.get(0);

            // Additional complex processing
            int sum = 0;
            for (int i = 0; i < values.size(); i++) {
                sum += values.get(i).length();
            }
            System.out.println("Total length of values: " + sum);

            // Read the comment from the record
            /* read */ String comment = firstRecord.getComment();

            // Output the comment
            System.out.println("Comment: " + comment);

            // More processing
            List<String> transformedValues = new ArrayList<>();
            for (String value : values) {
                transformedValues.add(value.toUpperCase());
            }

            // Output transformed values
            for (String transformedValue : transformedValues) {
                System.out.println("Transformed Record: " + transformedValue);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}