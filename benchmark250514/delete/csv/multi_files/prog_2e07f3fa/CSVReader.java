import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class CSVReader {
    private List<CSVRecord> records;

    public CSVReader(String csvData) throws IOException {
        CSVParser csvParser = CSVParser.parse(new StringReader(csvData), CSVFormat.DEFAULT);
        records = csvParser.getRecords();
    }

    public CSVRecord getRecord(int index) {
        return records.get(index);
    }
}
