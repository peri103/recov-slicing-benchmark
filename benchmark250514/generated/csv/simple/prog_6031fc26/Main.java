import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringWriter;
import java.io.StringReader;
import java.util.List;
import org.apache.commons.csv.CSVParser;

public class Main {
    public static void main(String[] args) {
        StringWriter writer = new StringWriter();
        CSVPrinter csvPrinter = null;
        CSVParser csvParser = null;

        try {
            // Initialize CSVPrinter
            csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT.withCommentMarker('#'));

            // Write a comment
            /* write */ csvPrinter.printComment("This is a comment");
            csvPrinter.flush();

            // Read back the comment
            csvParser = CSVParser.parse(new StringReader(writer.toString()), CSVFormat.DEFAULT.withCommentMarker('#'));
            List<CSVRecord> records = csvParser.getRecords();
            for (CSVRecord record : records) {
                if (record.getComment() != null) {
                    // Read the comment
                    /* read */ String comment = record.getComment();
                    System.out.println(comment);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (csvPrinter != null) {
                    csvPrinter.close();
                }
                if (csvParser != null) {
                    csvParser.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}