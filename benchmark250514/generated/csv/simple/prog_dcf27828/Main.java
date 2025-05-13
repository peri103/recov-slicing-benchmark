import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        try {
            // Define a CSV format with a comment marker
            CSVFormat format = CSVFormat.DEFAULT /* write */.withCommentMarker('#');

            // Create a CSV string with a comment
            String csvData = "# This is a comment\nheader1,header2\nvalue1,value2";

            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);

            // Iterate over the records and read the comment
            for (CSVRecord record : parser) {
                /* read */ String comment = record.getComment();
                if (comment != null) {
                    System.out.println(comment);
                }
            }

            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}