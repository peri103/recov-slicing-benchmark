import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSV format with a comment marker
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
            
            // Prepare a CSV string with comments
            String csvData = "# This is a comment\nname,age\nJohn,30\n";
            
            // Parse the CSV data using the format
            CSVParser parser = new CSVParser(new StringReader(csvData), format);
            
            // Read the first record to obtain the comment
            CSVRecord record = parser.getRecords().get(0);
            /* read */ String comment = record.getComment();
            
            // Print the comment
            System.out.println(comment);
            
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}