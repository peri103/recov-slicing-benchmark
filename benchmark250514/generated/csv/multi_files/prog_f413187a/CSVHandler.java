import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import java.util.List;

public class CSVHandler {
    private CSVFormat csvFormat;

    public CSVHandler() {
        this.csvFormat = CSVFormat.DEFAULT;
    }

    public void enableAutoFlush() {
        /* write */ this.csvFormat = this.csvFormat.withAutoFlush(true);
    }

    public List<CSVRecord> parseCSV(String csvData, String[] headers) throws IOException {
        CSVParser parser = csvFormat.withHeader(headers).parse(new StringReader(csvData));
        return parser.getRecords();
    }
}
