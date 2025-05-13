import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.List;

public class CSVUtil {
    private StringWriter writer;
    private CSVPrinter printer;
    private CSVFormat format;

    public CSVUtil() throws IOException {
        /* write */ format = CSVFormat.DEFAULT.withHeaderComments("This is a comment");
        writer = new StringWriter();
        printer = new CSVPrinter(writer, format);
    }

    public void printRecord(List<String> record) throws IOException {
        printer.printRecord(record);
        printer.flush();
    }

    public String getCSVContent() {
        return writer.toString();
    }
}
