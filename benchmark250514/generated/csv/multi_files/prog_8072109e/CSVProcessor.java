import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import java.io.StringWriter;
import java.io.IOException;
import java.util.List;

public class CSVProcessor {
    private CSVFormat csvFormat;
    private StringWriter writer = new StringWriter();
    private CSVPrinter csvPrinter;

    public CSVProcessor() throws IOException {
        // Initialize CSVFormat with a specific delimiter
        /* write */ this.csvFormat = CSVFormat.DEFAULT.withDelimiter(';');
        this.csvPrinter = new CSVPrinter(writer, csvFormat);
    }

    public void writeData(List<String> data) throws IOException {
        csvPrinter.printRecord(data);
        csvPrinter.flush();
    }

    public String getCSVOutput() {
        return writer.toString();
    }
}
