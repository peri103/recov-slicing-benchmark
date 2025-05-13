import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class CSVDataProcessor {
    private CSVConfiguration csvConfiguration;
    private List<CSVRecord> records;

    public CSVDataProcessor(CSVConfiguration csvConfiguration) {
        this.csvConfiguration = csvConfiguration;
    }

    public void parseData(String csvData) throws IOException {
        CSVParser parser = CSVParser.parse(new StringReader(csvData), csvConfiguration.getFormat());
        records = parser.getRecords();
    }

    public List<CSVRecord> getRecords() {
        return records;
    }
}
