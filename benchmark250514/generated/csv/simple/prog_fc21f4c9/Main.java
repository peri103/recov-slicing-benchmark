import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with a comment marker
        CSVFormat format = CSVFormat.DEFAULT /* write */.withCommentMarker('#');

        // Sample CSV data
        String csvData = "# This is a comment\n" +
                         "header1,header2\n" +
                         "value1,value2\n";

        try {
            // Parse the CSV data
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            
            for (CSVRecord record : parser) {
                // Read the comment
                String comment = /* read */ record.getComment();
                if (comment != null) {
                    System.out.println("Comment: " + comment);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}