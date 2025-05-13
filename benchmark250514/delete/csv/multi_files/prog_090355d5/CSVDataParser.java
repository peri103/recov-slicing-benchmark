import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class CSVDataParser {
    private List<CSVRecord> records;

    public CSVDataParser(String csvData, CSVFormat format) throws IOException {
        CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
        this.records = parser.getRecords();
    }

    public List<CSVRecord> getRecords() {
        return records;
    }
}
