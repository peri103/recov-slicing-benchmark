import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import java.io.IOException;
import java.io.StringWriter;

public class CommentWriter {
    private StringWriter writer = new StringWriter();
    private CSVPrinter printer;

    public CommentWriter() throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
        printer = new CSVPrinter(writer, format);
    }

    public void writeComment(String comment) throws IOException {
        /* write */ printer.printComment(comment);
        printer.flush();
    }

    public String getCsvContent() {
        return writer.toString();
    }
}