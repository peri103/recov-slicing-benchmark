import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class CSVProcessor {
    private CSVFormat format;

    public CSVProcessor() {
        // Initialize CSVFormat with trimming spaces
        format = CSVFormat.DEFAULT.withTrim(); /* write */
    }

    public List<CSVRecord> parseCSV(String csvData) throws IOException {
        return format.parse(new StringReader(csvData)).getRecords();
    }
}
