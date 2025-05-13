import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        // Create a CSV format with a comment marker
        CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
        
        // Prepare a CSV string with a comment
        String csvData = "# This is a comment\nheader1,header2\nvalue1,value2";
        
        // Parse the CSV data
        CSVParser parser = new CSVParser(new StringReader(csvData), format);
        
        // Retrieve the records
        List<CSVRecord> records = parser.getRecords();
        
        // Create a list to store comments
        ArrayList<String> commentsList = new ArrayList<>();
        
        // Loop through records and add comments to the list
        for (CSVRecord record : records) {
            if (record.getComment() != null) {
                commentsList.add(record.getComment());
            }
        }
        
        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 4: " + sum);
        
        // More complex operations using comments
        for (String comment : commentsList) {
            System.out.println("Processing comment: " + comment);
        }
        
        // Assuming the first record is a comment, read the comment
        /* read */ String comment = records.get(0).getComment();
        
        // Print the comment
        System.out.println(comment);
        
        // Close the parser
        parser.close();
    }
}