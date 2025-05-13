import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize a StringWriter to capture CSV output
            StringWriter out = new StringWriter();
            // Create a CSVPrinter using CSVFormat.DEFAULT
            CSVPrinter printer = new CSVPrinter(out, CSVFormat.DEFAULT);

            // Write a comment using printComment
            /* write */ printer.printComment("This is a comment");

            // Close the printer to flush the content
            printer.close();

            // Parse the CSV output using CSVParser
            StringReader reader = new StringReader(out.toString());
            CSVParser parser = CSVParser.parse(reader, CSVFormat.DEFAULT.withCommentMarker('#'));

            // Read the first record and get the comment
            CSVRecord record = parser.getRecords().get(0);
            /* read */ String comment = record.getComment();

            // Print the comment
            System.out.println(comment);

            // Close the parser
            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}