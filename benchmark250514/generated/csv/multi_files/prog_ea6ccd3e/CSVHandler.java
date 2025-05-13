import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringWriter;
import java.io.StringReader;
import java.util.List;

public class CSVHandler {
    private StringWriter writer;
    private CSVFormat format;
    private CSVPrinter printer;

    public CSVHandler() throws IOException {
        writer = new StringWriter();
        format = CSVFormat.DEFAULT.withCommentMarker('#');
        printer = new CSVPrinter(writer, format);
    }

    public void writeComment(String comment) throws IOException {
        /* write */ printer.printComment(comment);
        printer.flush();
    }

    public String getCSVData() {
        return writer.toString();
    }
}
