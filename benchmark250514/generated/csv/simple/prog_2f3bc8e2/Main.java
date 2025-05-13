import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringWriter;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        try {
            StringWriter writer = new StringWriter();
            CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
            CSVPrinter printer = new CSVPrinter(writer, format);

            /* write */ printer.printComment("This is a comment");
            printer.flush();

            String csvData = writer.toString();
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            CSVRecord record = parser.getRecords().get(0);

            /* read */ String comment = record.getComment();
            System.out.println(comment);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}