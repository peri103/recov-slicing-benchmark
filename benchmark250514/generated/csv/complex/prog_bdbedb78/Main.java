import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        // Initialize CSVFormat with a comment marker
        /* write */ CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');

        // Sample CSV input with a comment
        String csvData = "# This is a comment\nheader1,header2\nvalue1,value2";
        
        // Parse the CSV data
        CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
        List<CSVRecord> records = parser.getRecords();
        
        // Additional code to demonstrate complex operations
        ArrayList<String> headers = new ArrayList<>();
        headers.add("header1");
        headers.add("header2");
        
        ArrayList<String> values = new ArrayList<>();
        for (CSVRecord record : records) {
            for (String header : headers) {
                values.add(record.get(header));
            }
        }
        
        for (String value : values) {
            System.out.println("Value: " + value);
        }
        
        // Read the comment from the first record
        /* read */ String comment = records.get(0).getComment();
        
        // Print the comment
        System.out.println("Comment: " + comment);
        
        // Additional code to demonstrate more complex operations
        int sum = 0;
        for (String value : values) {
            sum += value.length();
        }
        System.out.println("Sum of value lengths: " + sum);
        
        // More operations with CSV records
        for (CSVRecord record : records) {
            System.out.println("Record: " + record);
        }
    }
}