import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSVFormat with a comment marker
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');

            // Prepare a CSV data string with a comment
            String csvData = "#This is a comment\nname,age\nJohn,30\nDoe,25";
            StringReader reader = new StringReader(csvData);

            // Parse the CSV data
            CSVParser parser = new CSVParser(reader, format);
            List<CSVRecord> records = parser.getRecords();

            // Read the comment
            /* read */ String comment = records.get(0).getComment();

            // Output the comment
            System.out.println(comment);

            // Close the parser
            parser.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}