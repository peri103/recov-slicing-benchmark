import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVHandler {
    private CSVFormat format;
    private List<CSVRecord> records;

    public CSVHandler(String csvData) throws IOException {
        /* write */ this.format = CSVFormat.DEFAULT.withTrailingDelimiter();
        CSVParser parser = new CSVParser(new StringReader(csvData), format);
        this.records = parser.getRecords();
        parser.close();
    }

    public CSVRecord getFirstRecord() {
        return records.get(0);
    }

    public List<CSVRecord> getRecords() {
        return new ArrayList<>(records);
    }
}
