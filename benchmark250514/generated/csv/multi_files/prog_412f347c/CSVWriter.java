import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.IOException;
import java.io.StringWriter;
import java.util.List;

public class CSVWriter {
    private CSVFormat format;
    private StringWriter writer;

    public CSVWriter() {
        this.format = CSVFormat.DEFAULT.withEscape('\\'); /* write */
        this.writer = new StringWriter();
    }

    public void writeRecord(List<String> data) throws IOException {
        CSVPrinter printer = new CSVPrinter(writer, format);
        printer.printRecord(data);
        printer.flush();
        printer.close();
    }

    public String getWrittenData() {
        return writer.toString();
    }
}
