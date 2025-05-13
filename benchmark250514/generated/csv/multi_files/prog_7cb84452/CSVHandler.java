import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.List;

public class CSVHandler {
    private CSVFormat format;

    public CSVHandler() {
        format = CSVFormat.DEFAULT;
    }

    public void configureFormat() {
        /* write */ format = format.withFirstRecordAsHeader();
    }

    public List<CSVRecord> parseCSV(String csvData) throws IOException {
        Reader in = new StringReader(csvData);
        CSVParser parser = new CSVParser(in, format);
        return parser.getRecords();
    }
}
