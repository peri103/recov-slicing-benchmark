import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import java.io.StringWriter;
import java.io.IOException;

public class CSVWriter {
    private StringWriter writer;
    private CSVPrinter printer;

    public CSVWriter() throws IOException {
        this.writer = new StringWriter();
        this.printer = new CSVPrinter(writer, CSVFormat.DEFAULT);
    }

    public void writeData(String data) throws IOException {
        /* write */ printer.print(data);
        printer.flush(); // Ensure data is written to the StringWriter
    }

    public String getCSVData() {
        return writer.toString();
    }

    public void close() throws IOException {
        printer.close();
        writer.close();
    }
}
