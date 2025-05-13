import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;

public class CSVHandler {
    private CSVFormat format;
    private List<CSVRecord> records;

    public CSVHandler(String csvData) throws Exception {
        format = CSVFormat.DEFAULT;
        /* write */ format = format.withHeaderComments("This is a comment");
        CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
        records = parser.getRecords();
    }

    public List<CSVRecord> getRecords() {
        return records;
    }
}
