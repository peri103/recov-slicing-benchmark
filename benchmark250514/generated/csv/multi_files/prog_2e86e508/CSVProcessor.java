import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;

public class CSVProcessor {
    private CSVFormat format;

    public CSVProcessor() {
        // Create CSVFormat with the first record as header
        /* write */ this.format = CSVFormat.DEFAULT.withFirstRecordAsHeader();
    }

    public List<CSVRecord> parseCSV(String csvData) throws Exception {
        CSVParser parser = this.format.parse(new StringReader(csvData));
        return parser.getRecords();
    }
}
