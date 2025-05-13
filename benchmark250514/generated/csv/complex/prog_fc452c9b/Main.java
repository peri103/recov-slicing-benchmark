import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a comment marker
            CSVFormat format = CSVFormat.DEFAULT;
            /* write */ format = format.withCommentMarker('#');
            
            // Sample CSV data with a comment
            String csvData = "# This is a comment\nheader1,header2\nvalue1,value2";
            
            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            
            // Additional logic for handling records
            List<String> headers = new ArrayList<>();
            List<List<String>> recordsData = new ArrayList<>();
            
            for (CSVRecord record : parser) {
                if (parser.getCurrentLineNumber() == 1) {
                    // Capture headers
                    headers.add(record.get(0));
                    headers.add(record.get(1));
                } else {
                    // Capture data
                    List<String> rowData = new ArrayList<>();
                    rowData.add(record.get(0));
                    rowData.add(record.get(1));
                    recordsData.add(rowData);
                }
            }
            
            // Processing the records data
            for (List<String> row : recordsData) {
                for (String value : row) {
                    System.out.println("Value: " + value);
                }
            }
            
            // Read comment from the first record
            for (CSVRecord record : parser) {
                /* read */ String comment = record.getComment();
                if (comment != null) {
                    System.out.println("Comment: " + comment);
                }
            }
            
            // Additional unrelated computation
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
            }
            System.out.println("Sum of first 10 numbers: " + sum);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}