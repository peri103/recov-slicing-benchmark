import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVProcessor {
    private CSVFormat format;
    private List<CSVRecord> records;

    public CSVProcessor(String csvData) {
        try {
            /* write */ this.format = CSVFormat.DEFAULT.withTrim();
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            this.records = parser.getRecords();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<CSVRecord> getRecords() {
        return records;
    }
}
