import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            String csvData = "# This is a comment\nheader1,header2\nvalue1,value2";
            
            // Configure CSVFormat with a comment marker
            CSVFormat csvFormat = CSVFormat.DEFAULT;
            /* write */ csvFormat = csvFormat.withCommentMarker('#');
            
            // Create another CSVFormat for demonstration
            CSVFormat csvFormat2 = CSVFormat.DEFAULT.withDelimiter(';');
            
            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), csvFormat);
            List<CSVRecord> records = parser.getRecords();
            
            // Process each record
            for (CSVRecord record : records) {
                // Perform some unrelated processing
                for (String value : record) {
                    System.out.println("Value: " + value);
                }
                
                // Read the comment from the record
                /* read */ String comment = record.getComment();
                if (comment != null) {
                    System.out.println("Comment: " + comment);
                }
                
                // Additional processing to make the program more complex
                int sum = 0;
                for (int i = 0; i < record.size(); i++) {
                    sum += record.get(i).length();
                }
                System.out.println("Sum of lengths: " + sum);
            }
            
            // Demonstrate CSVFormat2 usage
            String csvData2 = "value1;value2";
            CSVParser parser2 = CSVParser.parse(new StringReader(csvData2), csvFormat2);
            List<CSVRecord> records2 = parser2.getRecords();
            for (CSVRecord record2 : records2) {
                for (String value : record2) {
                    System.out.println("CSV2 Value: " + value);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}