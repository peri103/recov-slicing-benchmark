import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class CSVProcessor {
    private CSVConfiguration config;
    private List<CSVRecord> records;

    public CSVProcessor(CSVConfiguration config) {
        this.config = config;
        this.records = new ArrayList<>();
    }

    public void parseCSVData(String csvData) throws IOException {
        CSVParser parser = CSVParser.parse(new StringReader(csvData), config.getFormat());
        this.records = parser.getRecords();
    }

    public List<CSVRecord> getRecords() {
        return records;
    }

    public String getFirstRecordAsString() {
        CSVRecord record = records.get(0);
        return record.toString(); /* read */
    }
}
