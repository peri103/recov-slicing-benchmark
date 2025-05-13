import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class Main {
    public static void main(String[] args) {
        try {
            StringWriter out = new StringWriter();
            CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
            CSVPrinter printer = new CSVPrinter(out, format);

            /* write */ printer.printComment("This is a comment");
            printer.flush();

            String csvContent = out.toString();
            StringReader reader = new StringReader(csvContent);

            Iterable<CSVRecord> records = CSVFormat.DEFAULT.withCommentMarker('#').parse(reader);
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