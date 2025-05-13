import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import java.util.List;
import org.apache.commons.csv.CSVParser;

public class CSVHandler {
    private CSVFormat format;
    private List<CSVRecord> records;

    public CSVHandler(String csvData) throws IOException {
        format = CSVFormat.DEFAULT;
        /* write */ format = format.withHeaderComments("This is a header comment");
        CSVParser parser = new CSVParser(new StringReader(csvData), format);
        records = parser.getRecords();
        parser.close();
    }

    public List<CSVRecord> getRecords() {
        return records;
    }
}
