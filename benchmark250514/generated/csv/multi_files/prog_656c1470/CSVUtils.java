import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class CSVUtils {
    private CSVFormat format;
    private List<CSVRecord> records;

    public CSVUtils(String csvData) throws IOException {
        format = CSVFormat.DEFAULT;
        /* write */ format = format.withFirstRecordAsHeader();
        CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
        records = parser.getRecords();
    }

    public List<CSVRecord> getRecords() {
        return records;
    }
}
