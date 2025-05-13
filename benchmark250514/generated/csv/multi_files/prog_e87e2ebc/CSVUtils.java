import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;

public class CSVUtils {
    private CSVFormat format;

    public CSVUtils() {
        // Initialize CSVFormat with the write method
        /* write */ format = CSVFormat.DEFAULT.withIgnoreHeaderCase();
    }

    public List<CSVRecord> parseCSV(String csvData) throws Exception {
        CSVParser parser = new CSVParser(new StringReader(csvData), format);
        return parser.getRecords();
    }
}
