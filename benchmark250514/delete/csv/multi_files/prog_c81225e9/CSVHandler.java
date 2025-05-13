import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import java.io.IOException;
import java.io.StringWriter;

public class CSVHandler {
    private StringWriter writer;
    private CSVPrinter printer;

    public CSVHandler() throws IOException {
        writer = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT /* write */ .withQuote('"');
        printer = new CSVPrinter(writer, format);
    }

    public void writeRecord(String... values) throws IOException {
        printer.printRecord(values);
        printer.flush();
    }

    public String getCSVContent() {
        return writer.toString();
    }
}
