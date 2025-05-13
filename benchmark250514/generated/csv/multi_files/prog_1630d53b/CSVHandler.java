import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class CSVHandler {
    private CSVFormat format;
    private List<CSVRecord> records;

    public CSVHandler(String csvData) {
        try {
            /* write */ this.format = CSVFormat.DEFAULT.withHeaderComments("This is a header comment");
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            this.records = parser.getRecords();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<CSVRecord> getRecords() {
        return this.records;
    }

    public CSVFormat getFormat() {
        return this.format;
    }
}
