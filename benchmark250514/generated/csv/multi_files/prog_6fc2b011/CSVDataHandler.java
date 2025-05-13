import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class CSVDataHandler {
    private CSVFormat format;

    public CSVDataHandler() {
        /* write */ this.format = CSVFormat.DEFAULT.withIgnoreEmptyLines(true);
    }

    public List<CSVRecord> parseCSVData(String csvData) throws IOException {
        CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
        return parser.getRecords();
    }
}
