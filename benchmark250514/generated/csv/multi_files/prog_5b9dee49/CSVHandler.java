import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class CSVHandler {
    private CSVFormat quotedFormat;

    public CSVHandler() {
        CSVFormat format = CSVFormat.DEFAULT.withQuote('"');
        /* write */ this.quotedFormat = format.withQuote('"');
    }

    public List<CSVRecord> parseCSV(String csvData) throws IOException {
        return quotedFormat.parse(new StringReader(csvData)).getRecords();
    }
}
