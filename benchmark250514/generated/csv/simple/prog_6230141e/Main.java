import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StringWriter writer = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
        
        try {
            CSVPrinter printer = new CSVPrinter(writer, format);
            /* write */ printer.printComment("This is a comment");
            printer.flush();

            StringReader reader = new StringReader(writer.toString());
            Iterable<CSVRecord> records = format.parse(reader);
            for (CSVRecord record : records) {
                /* read */ String comment = record.getComment();
                if (comment != null) {
                    System.out.println(comment);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}