import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.IOException;
import java.io.StringWriter;

public class CSVOperations {
    private StringWriter writer;
    private CSVPrinter csvPrinter;

    public CSVOperations() throws IOException {
        writer = new StringWriter();
        csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);
    }

    public void writeRecord(String... values) throws IOException {
        /* write */ csvPrinter.printRecord(values);
        csvPrinter.flush();
    }

    public String getCSVContent() {
        return writer.toString();
    }
}
