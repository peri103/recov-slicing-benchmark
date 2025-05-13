import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringWriter;
import java.util.List;

public class CSVManager {
    private StringWriter writer = new StringWriter();
    private CSVPrinter csvPrinter;

    public CSVManager() throws IOException {
        csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);
    }

    public void addComment(String comment) throws IOException {
        /* write */ csvPrinter.printComment(comment);
    }

    public List<CSVRecord> getRecords() throws IOException {
        csvPrinter.flush();
        String csvData = writer.toString();
        return CSVFormat.DEFAULT.parse(new java.io.StringReader(csvData)).getRecords();
    }
}
