import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;

import java.io.StringWriter;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize the writer for CSV output
            StringWriter writer = new StringWriter();
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);

            // Use the write method to print a comment
            /* write */ csvPrinter.printComment("This is a comment");
            csvPrinter.flush();

            // Parse the written CSV content
            CSVParser parser = CSVParser.parse(writer.toString(), CSVFormat.DEFAULT.withCommentMarker('#'));
            List<CSVRecord> records = parser.getRecords();

            // Use the read method to get the comment
            /* read */ String comment = records.get(0).getComment();

            // Output the comment
            System.out.println(comment);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}