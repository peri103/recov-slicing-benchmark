import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a comment marker
            CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
            /* write */ format = format.withCommentMarker('#');

            // Prepare a sample CSV data with a comment
            String csvData = "# This is a comment\nheader1,header2\nvalue1,value2";
            
            // Additional CSV data processing
            String additionalCsvData = "header3,header4\nvalue3,value4";
            CSVParser additionalParser = CSVParser.parse(new StringReader(additionalCsvData), CSVFormat.DEFAULT);
            List<CSVRecord> additionalRecords = additionalParser.getRecords();
            for (CSVRecord record : additionalRecords) {
                System.out.println("Additional Record: " + record);
            }
            
            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();

            // Perform some unrelated operations to increase complexity
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
            }
            System.out.println("Sum of first 10 numbers: " + sum);
            
            // More unrelated operations
            StringBuilder sb = new StringBuilder();
            for (CSVRecord record : records) {
                sb.append(record.get(0)).append(", ").append(record.get(1)).append("\n");
            }
            System.out.println("CSV Records:\n" + sb.toString());

            // Read the comment from the CSVRecord
            /* read */ String comment = records.get(0).getComment();

            // Print the comment
            System.out.println("Comment from CSV: " + comment);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}