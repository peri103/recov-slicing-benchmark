import java.io.IOException;
import java.io.StringWriter;
import java.util.List;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

public class CustomCSVPrinter {
    private StringWriter writer = new StringWriter();
    private CSVPrinter csvPrinter;

    public CustomCSVPrinter() throws IOException {
        csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);
    }

    public void addRecord(List<String> record) throws IOException {
        /* write */ csvPrinter.printRecord(record);
        csvPrinter.flush();
    }

    public String getCSVContent() {
        return writer.toString();
    }
}
