import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;

public class CSVHandler {
    private List<CSVRecord> records;

    public CSVHandler(String csvData) throws Exception {
        /* write */ CSVFormat format = CSVFormat.DEFAULT.withFirstRecordAsHeader();
        CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
        this.records = parser.getRecords();
    }

    public CSVRecord getRecord(int index) {
        return records.get(index);
    }
}
