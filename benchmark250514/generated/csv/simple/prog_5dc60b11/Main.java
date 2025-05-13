import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Reader;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        StringWriter writer = new StringWriter();
        CSVPrinter printer = new CSVPrinter(writer, CSVFormat.DEFAULT);

        /* write */ printer.printComment("This is a comment");

        printer.flush();
        printer.close();

        Reader reader = new StringReader(writer.toString());
        List<CSVRecord> records = CSVFormat.DEFAULT.parse(reader).getRecords();

        // Assuming the comment is associated with the first record
        CSVRecord record = records.get(0);
        /* read */ String comment = record.getComment();

        System.out.println(comment);
    }
}