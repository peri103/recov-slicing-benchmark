import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringWriter;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StringWriter writer = new StringWriter();
        CSVPrinter printer = null;
        try {
            printer = new CSVPrinter(writer, CSVFormat.DEFAULT);
            /* write */ printer.printComment("This is a comment");
            printer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String csvContent = writer.toString();
        StringReader reader = new StringReader(csvContent);
        Iterable<CSVRecord> records = null;
        try {
            records = CSVFormat.DEFAULT.parse(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (CSVRecord record : records) {
            /* read */ String comment = record.getComment();
            if (comment != null) {
                System.out.println(comment);
            }
        }
    }
}