import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringWriter;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        StringWriter writer = new StringWriter();
        try {
            // Initialize CSVPrinter
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);

            // Write a comment
            /* write */ csvPrinter.printComment("This is a comment");

            // Make sure to flush the printer to write the data to the writer
            csvPrinter.flush();

            // Read the comment using CSVParser
            CSVParser parser = CSVParser.parse(new StringReader(writer.toString()), CSVFormat.DEFAULT.withCommentMarker('#'));
            for (CSVRecord record : parser) {
                // Assuming the comment is associated with the record
                /* read */ String comment = record.getComment();
                System.out.println(comment);
            }

            csvPrinter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}