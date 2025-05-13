import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Reader;
import java.io.StringReader;
import org.apache.commons.csv.CSVParser;
import java.util.List;

public class CSVHandler {
    private CSVFormat csvFormat;
    private StringWriter writer;

    public CSVHandler() {
        this.csvFormat = CSVFormat.DEFAULT;
        this.writer = new StringWriter();
    }

    public void addHeaderComment(String comment) {
        /* write */ this.csvFormat = this.csvFormat.withHeaderComments(comment);
    }

    public void writeCSV() throws IOException {
        CSVPrinter csvPrinter = new CSVPrinter(writer, csvFormat);
        csvPrinter.printRecord("Header1", "Header2");
        csvPrinter.printRecord("Value1", "Value2");
        csvPrinter.close();
    }

    public String getCSVContent() {
        return writer.toString();
    }
}
