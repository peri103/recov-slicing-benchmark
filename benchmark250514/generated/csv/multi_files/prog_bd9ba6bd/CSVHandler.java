import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class CSVHandler {
    private CSVFormat format;

    public CSVHandler() {
        // Initialize CSVFormat with the write method
        format = CSVFormat.DEFAULT.withIgnoreEmptyLines(true); /* write */
    }

    public List<CSVRecord> parseCSV(String csvData) throws IOException {
        CSVParser parser = new CSVParser(new StringReader(csvData), format);
        return parser.getRecords();
    }
}
