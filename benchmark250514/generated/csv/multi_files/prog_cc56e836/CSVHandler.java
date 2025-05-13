import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.util.List;

public class CSVHandler {
    private List<CSVRecord> records;

    public CSVHandler(String csvData) throws IOException {
        CSVFormat format = CSVFormat.DEFAULT.withHeaderComments("This is a comment");
        CSVParser parser = CSVParser.parse(csvData, format);
        this.records = parser.getRecords();
    }

    public CSVRecord getFirstRecord() {
        return records.get(0);
    }

    public List<CSVRecord> getRecords() {
        return records;
    }
}
