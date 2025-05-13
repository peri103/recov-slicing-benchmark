import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.StringWriter;
import java.io.StringReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Prepare CSVFormat with header comments
            CSVFormat format = CSVFormat.DEFAULT.withHeaderComments("This is a header comment");

            // Use a StringWriter to capture the CSV output
            StringWriter out = new StringWriter();
            CSVPrinter printer = new CSVPrinter(out, format);
            printer.printRecord("Column1", "Column2");
            printer.printRecord("Value1", "Value2");
            printer.flush();

            // Read the CSV content using CSVParser
            StringReader in = new StringReader(out.toString());
            CSVParser parser = CSVParser.parse(in, format);

            // Assume we want to read the comment from the first record
            CSVRecord record = parser.getRecords().get(0);
            /* read */ String comment = record.getComment();
            System.out.println(comment);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}