import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.util.List;

public class CSVHandler {
    private CSVFormat csvFormat;

    public CSVHandler() {
        this.csvFormat = CSVFormat.DEFAULT;
    }

    public void configureFormat() {
        /* write */ csvFormat = csvFormat.withQuote('"');
    }

    public List<CSVRecord> parseCSV(String csvData) throws IOException {
        return CSVParser.parse(csvData, csvFormat).getRecords();
    }
}
