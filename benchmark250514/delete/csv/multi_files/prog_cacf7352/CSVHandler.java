import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringWriter;
import java.io.StringReader;
import java.util.List;
import org.apache.commons.csv.CSVParser;

public class CSVHandler {
    private StringWriter writer = new StringWriter();
    private CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
    private CSVPrinter printer;

    public CSVHandler() {
        try {
            printer = new CSVPrinter(writer, format);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeComment(String comment) {
        try {
            /* write */ printer.printComment(comment);
            printer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<CSVRecord> parseCSV() {
        String csvData = writer.toString();
        StringReader reader = new StringReader(csvData);
        CSVParser parser = null;
        try {
            parser = CSVParser.parse(reader, format);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return parser.getRecords();
    }
}
