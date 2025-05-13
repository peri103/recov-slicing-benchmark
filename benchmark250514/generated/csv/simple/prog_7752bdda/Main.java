import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringWriter;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        try {
            StringWriter writer = new StringWriter();
            CSVFormat format = CSVFormat.DEFAULT.withHeader("Header1").withCommentMarker('#');
            CSVPrinter printer = new CSVPrinter(writer, format);

            /* write */ printer.printComment("This is a comment");

            printer.flush();
            String csvData = writer.toString();

            StringReader reader = new StringReader(csvData);
            Iterable<CSVRecord> records = format.parse(reader);
            for (CSVRecord record : records) {
                /* read */ String comment = record.getComment();
                System.out.println(comment);
                break; // ensure read is executed only once
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}