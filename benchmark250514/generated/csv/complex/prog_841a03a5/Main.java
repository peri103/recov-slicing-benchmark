import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a comment marker
            CSVFormat format = CSVFormat.DEFAULT
                    /* write */ .withCommentMarker('#');

            // Prepare a CSV string with a comment
            String csvData = "# This is a comment\nheader1,header2\nvalue1,value2";

            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();

            // Additional complexity: Process records to extract values
            List<String> values = new ArrayList<>();
            for (CSVRecord record : records) {
                for (int i = 0; i < record.size(); i++) {
                    values.add(record.get(i));
                }
            }

            // Perform some operations on the extracted values
            int sum = 0;
            for (String value : values) {
                sum += value.length();
            }
            System.out.println("Sum of lengths of all values: " + sum);

            // Read the comment from the first record
            CSVRecord firstRecord = records.get(0);
            /* read */ String comment = firstRecord.getComment();

            // Output the comment
            System.out.println(comment);

            // Additional complexity: Check if the comment contains a specific word
            if (comment != null && comment.contains("comment")) {
                System.out.println("The comment contains the word 'comment'.");
            }

            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}