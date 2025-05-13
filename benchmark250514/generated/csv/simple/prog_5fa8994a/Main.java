import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) throws IOException {
        String csvData = "# This is a comment\nname,age\nJohn,30\n# Another comment\nDoe,25";
        
        // Create a CSVFormat with a comment marker
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withCommentMarker('#');

        // Parse the CSV data
        CSVParser parser = CSVParser.parse(new StringReader(csvData), format);

        // Iterate through the records
        for (CSVRecord record : parser) {
            // Check for comments and read them
            if (record.hasComment()) {
                /* read */ String comment = record.getComment();
                System.out.println("Comment: " + comment);
            }
        }
    }
}