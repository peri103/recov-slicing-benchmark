import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class Main {
    public static void main(String[] args) {
        StringWriter out = new StringWriter();
        CSVPrinter printer = null;
        CSVParser parser = null;
        try {
            printer = new CSVPrinter(out, CSVFormat.DEFAULT.withCommentMarker('#'));
            /* write */ printer.printComment("This is a comment");
            printer.flush();

            parser = new CSVParser(new StringReader(out.toString()), CSVFormat.DEFAULT.withCommentMarker('#'));
            for (CSVRecord record : parser) {
                /* read */ String comment = record.getComment();
                if (comment != null) {
                    System.out.println(comment);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (printer != null) printer.close();
                if (parser != null) parser.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}