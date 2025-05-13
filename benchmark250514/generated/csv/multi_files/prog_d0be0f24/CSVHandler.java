import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import java.io.IOException;
import java.io.StringWriter;

public class CSVHandler {
    private CSVFormat format;
    private StringWriter writer;

    public CSVHandler() {
        format = CSVFormat.DEFAULT;
        writer = new StringWriter();
    }

    public void configureFormat() {
        /* write */ format = format.withQuote('"');
    }

    public void writeData(String... data) throws IOException {
        CSVPrinter printer = new CSVPrinter(writer, format);
        printer.printRecord(data);
        printer.flush();
    }

    public String getWrittenData() {
        return writer.toString();
    }
}