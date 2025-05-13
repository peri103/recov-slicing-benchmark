import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class CSVHandler {
    private CSVFormat format;
    private List<CSVRecord> records;

    public CSVHandler(String csvData) throws IOException {
        /* write */ this.format = CSVFormat.DEFAULT.withHeaderComments("This is a comment");
        CSVParser parser = new CSVParser(new StringReader(csvData), format);
        this.records = parser.getRecords();
    }

    public List<CSVRecord> getRecords() {
        return records;
    }

    public CSVFormat getFormat() {
        return format;
    }
}
