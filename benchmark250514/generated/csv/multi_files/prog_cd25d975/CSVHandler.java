import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;

public class CSVHandler {
    private CSVFormat format;

    public CSVHandler() {
        /* write */ format = CSVFormat.DEFAULT.withFirstRecordAsHeader();
    }

    public List<CSVRecord> parseCSV(String csvData) throws Exception {
        CSVParser parser = new CSVParser(new StringReader(csvData), format);
        return parser.getRecords();
    }
}
