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
            
            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), csvFormat);
            List<CSVRecord> records = parser.getRecords();
            
            for (CSVRecord record : records) {
                // Read the comment from the record
                /* read */ String comment = record.getComment();
                if (comment != null) {
                    System.out.println("Comment: " + comment);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}