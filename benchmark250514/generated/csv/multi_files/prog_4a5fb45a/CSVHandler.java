import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.util.List;

public class CSVHandler {
    private CSVFormat format;

    public CSVHandler() {
        /* write */ format = CSVFormat.DEFAULT.withRecordSeparator(";");
    }

    public List<CSVRecord> parseCSV(String csvData) throws IOException {
        CSVParser parser = CSVParser.parse(csvData, format);
        return parser.getRecords();
    }
}
