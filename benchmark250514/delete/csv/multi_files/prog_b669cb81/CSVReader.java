import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.util.List;

public class CSVReader {
    private CSVParser parser;
    private List<CSVRecord> records;

    public CSVReader(CSVFormat format, String csvData) throws IOException {
        parser = CSVParser.parse(csvData, format);
        records = parser.getRecords();
    }

    public CSVRecord getFirstRecord() {
        return records.get(0);
    }
}
