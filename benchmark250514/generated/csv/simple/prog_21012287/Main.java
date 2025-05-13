import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) throws IOException {
        String csvData = "# This is a comment\nname,age\nJohn,30\nDoe,25";
        
        // Initialize CSVFormat with a comment marker
        /* write */ CSVFormat csvFormat = CSVFormat.DEFAULT.withCommentMarker('#');
        
        // Parse the CSV data
        CSVParser parser = CSVParser.parse(new StringReader(csvData), csvFormat);
        
        // Iterate through the records
        for (CSVRecord record : parser) {
            // Check if the record is a comment
            if (record.getComment() != null) {
                /* read */ String comment = record.getComment();
                System.out.println(comment);
            }
        }
    }
}