import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.IOException;
import java.io.StringWriter;

public class CSVWriter {
    private StringWriter writer = new StringWriter();
    private CSVPrinter printer;

    public CSVWriter() {
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
