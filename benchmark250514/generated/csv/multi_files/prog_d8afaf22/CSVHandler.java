import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import java.io.StringWriter;
import java.io.IOException;

public class CSVHandler {
    private StringWriter writer = new StringWriter();
    private CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
    private CSVPrinter csvPrinter;

    public CSVHandler() throws IOException {
        csvPrinter = new CSVPrinter(writer, format);
    }

    public void addComment(String comment) throws IOException {
        /* write */ csvPrinter.printComment(comment);
        csvPrinter.flush();
    }

    public String getCSVData() {
        return writer.toString();
    }
}
