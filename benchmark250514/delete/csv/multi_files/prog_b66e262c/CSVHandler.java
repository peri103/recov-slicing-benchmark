import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;

public class CSVHandler {
    private CSVFormat format;
    private List<CSVRecord> records;

    public CSVHandler(String csvData) {
        try {
            /* write */ format = CSVFormat.DEFAULT.withHeaderComments("This is a comment");
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            records = parser.getRecords();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public CSVRecord getFirstRecord() {
        return records.get(0);
    }
}
