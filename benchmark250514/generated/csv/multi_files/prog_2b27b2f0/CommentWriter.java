import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import java.io.StringWriter;
import java.io.IOException;

public class CommentWriter {
    private StringWriter writer = new StringWriter();
    private CSVPrinter printer;

    public CommentWriter() {
        try {
            printer = new CSVPrinter(writer, CSVFormat.DEFAULT);
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

    public String getWrittenData() {
        return writer.toString();
    }
}
